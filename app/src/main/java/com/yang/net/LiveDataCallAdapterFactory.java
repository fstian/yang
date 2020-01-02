package com.yang.net;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class LiveDataCallAdapterFactory extends CallAdapter.Factory {
    private  final String TAG ="LiveDataCallA" ;

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {

        Log.i(TAG, "get: "+returnType);

        Log.i(TAG, "get: "+ MutableLiveData.class.getName());

        Class<?> rawType = getRawType(returnType);

        int length = annotations.length;

        for (Annotation annotation : annotations) {
            Log.i(TAG, "get: "+annotation.toString());
        }

        Log.i(TAG, "get: "+rawType.getName());

        //返回值必须是Custom并且带有泛型（参数类型），根据APIService接口中的方法返回值，确定returnType
        //如 CustomCall<String> getCategories();，那确定returnType就是CustomCall<String>
        if (rawType == MutableLiveData.class && returnType instanceof ParameterizedType) {
            Type callReturnType = getParameterUpperBound(0, (ParameterizedType) returnType);
            Log.i(TAG, "get__: "+callReturnType);
            return new LiveCallAdapter(callReturnType);
        }

        return null;
    }
}
