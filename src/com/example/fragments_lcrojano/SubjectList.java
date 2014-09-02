package com.example.fragments_lcrojano;





import android.app.ListFragment;

import android.os.Bundle;


import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SubjectList extends ListFragment{

	String[] text = new String[] { "Base datos", "Complejidad", "Algoritmos", "Español",  
		    "Etíca" };  
		  
		  
		  @Override  
		  public void onListItemClick(ListView l, View v, int position, long id) {  
			  super.onListItemClick(l, v, position, id);
				String val;
				Subject fragment2 = new Subject();
				Bundle args = new Bundle();
				val = text[position];
				args.putString("someInt", val);
				fragment2.setArguments(args);

				android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
				ft.replace(android.R.id.content, fragment2);	
				ft.addToBackStack("fragment2");
				ft.commit();
			  Toast.makeText(getActivity(), "Item " + position + " click", Toast.LENGTH_SHORT).show();
		  }  
		  
		  @Override  
		  public View onCreateView(LayoutInflater inflater, ViewGroup container,  
		    Bundle savedInstanceState) {  
		   ArrayAdapter<String> adapter = new ArrayAdapter<String>(  
		     inflater.getContext(), android.R.layout.simple_list_item_1,  
		     text);  
		   setListAdapter(adapter);  
		   return super.onCreateView(inflater, container, savedInstanceState);  
		  }  
}
