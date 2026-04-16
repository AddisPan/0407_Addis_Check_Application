package com.example.a0407_addis_check_application;

public class BlindBoxManage {
    private static BlindBoxManage mBlindBoxManage;

    private BlindBoxManage() {
    }

    public static BlindBoxManage saveIntoBlindBoxManage() {
        if (mBlindBoxManage == null) {
            mBlindBoxManage = new BlindBoxManage();
        }
        return mBlindBoxManage;
    }
}
