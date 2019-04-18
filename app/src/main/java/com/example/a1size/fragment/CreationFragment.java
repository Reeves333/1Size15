package com.example.a1size.fragment;

import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;

public class CreationFragment extends Fragment {

    private EditText etDescription;
    private Button addPhoto;
    private ImageView ivImage;
    private Button btnSubmit;

    public final static int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1034;
    public String photoFileName = "photo.jpg";
    File photoFile;
}
