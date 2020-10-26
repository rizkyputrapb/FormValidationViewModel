package com.example.viewmodelexercise.viewmodel;

import android.util.Log;

import com.example.viewmodelexercise.model.Student;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormValidationViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> nim = new MutableLiveData<>();
    public MutableLiveData<Student> studentMutableLiveData = new MutableLiveData<>();
    public Student stud = new Student();

    public void onClicked() {
        stud = new Student(name.getValue(), nim.getValue(), email.getValue());
        studentMutableLiveData.setValue(stud);
        Log.d("Add Student Name : ", String.valueOf(stud.getName()));
        Log.d("Add Student NIM : ", String.valueOf(stud.getNim()));
        Log.d("Add Student Email : ", String.valueOf(stud.getEmail()));
    }
}