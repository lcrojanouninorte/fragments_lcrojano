package com.example.fragments_lcrojano;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Subject extends Fragment {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		    View rootView = inflater.inflate(R.layout.subject, container, false);
			TextView mTextView = (TextView) rootView.findViewById(R.id.textView1);
			String val = getArguments().getString("someInt");
			mTextView.setText(val.toString());
			
			Button button = (Button) rootView.findViewById(R.id.button1);

			button.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					getActivity().getFragmentManager().popBackStack();
				}
			});
			return rootView;
	 }
}

