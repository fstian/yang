package com.yang.net;

import android.util.Log;

import com.yang.entity.BaseRespon;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public class LiveCallAdapter<R> implements CallAdapter<R, MutableLiveData<R>> {

    private final Type returnType;
    private String TAG="LiveCallAdapter";


    public LiveCallAdapter(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public Type responseType() {
        return returnType;
    }

    @Override
    public MutableLiveData<R> adapt(final Call<R> call) {

         return new MutableLiveData<R>(){
            public AtomicBoolean atomicBoolean = new AtomicBoolean(false);
             @Override
             protected void onActive() {
                 Log.i(TAG, "onActive: ");
                 super.onActive();
                 if(atomicBoolean.compareAndSet(false,true)){
                     call.enqueue(new Callback<R>() {
                         @Override
                         public void onResponse(Call<R> call, Response<R> response) {
//                             String s = response.body().toString();
//                             String message = response.message();
//                             Log.i(TAG, "onResponse: "+s);
//                             Log.i(TAG, "onResponse: "+message);

                             postValue(response.body());
                         }
                         @Override
                         public void onFailure(Call<R> call, Throwable t) {
                             postValue((R) new BaseRespon<String>(555,"err",t.getMessage(  )));
                         }
                     });
                 }
             }
         };
    }


}
