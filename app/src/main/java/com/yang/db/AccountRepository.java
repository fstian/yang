package com.yang.db;

public class AccountRepository {


    private final AccountDao mAccountDao;

    public AccountRepository(AccountDao accountDao) {
        mAccountDao = accountDao;
    }



    public void saveAll(){
        mAccountDao.insertAll();
    }






}
