package com.harrymoreno.tutorialReadContacts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

public class ExampleFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater,
                           ViewGroup container,
                           Bundle savedInstancestate) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragments_layout,
                            container,
                            false);
  }
}
