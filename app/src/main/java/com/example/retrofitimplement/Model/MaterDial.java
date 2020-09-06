package com.example.retrofitimplement.Model;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.shreyaspatil.MaterialDialog.MaterialDialog;
import com.shreyaspatil.MaterialDialog.model.DialogButton;

public class MaterDial extends MaterialDialog {
    protected MaterDial(@NonNull Activity mActivity, @NonNull String title, @NonNull String message, boolean mCancelable, @NonNull DialogButton mPositiveButton, @NonNull DialogButton mNegativeButton, int mAnimationResId, @NonNull String mAnimationFile) {
        super(mActivity, title, message, mCancelable, mPositiveButton, mNegativeButton, mAnimationResId, mAnimationFile);
    }
}
