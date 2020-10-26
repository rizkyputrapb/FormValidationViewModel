package com.example.viewmodelexercise.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodelexercise.R;
import com.example.viewmodelexercise.databinding.FormValidationFragmentBinding;
import com.example.viewmodelexercise.viewmodel.FormValidationViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FormValidation extends Fragment {

    private FormValidationViewModel mViewModel;

    public static FormValidation newInstance() {
        return new FormValidation();
    }

    public FormValidation() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        FormValidationFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.form_validation_fragment, container, false);
        View view = binding.getRoot();
        mViewModel = new ViewModelProvider(this).get(FormValidationViewModel.class);
        binding.setFormValidationViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        return view;
    }

}