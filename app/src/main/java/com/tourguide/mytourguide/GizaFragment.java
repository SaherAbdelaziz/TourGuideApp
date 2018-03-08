package com.tourguide.mytourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GizaFragment extends Fragment {
    ArrayList<myItem> myItemList;

    public GizaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.list_of_myitems, container, false);
        myItemList=new ArrayList<>();
        ListView list;
        final String[] itemname = {
                getActivity().getString(R.string.Egyptian),
                getActivity().getString(R.string.GizaP),
                getActivity().getString(R.string.Great),
                getActivity().getString(R.string.Pyramids),
                getActivity().getString(R.string.Pharonic)
        };
        final String[] description = {
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc),
                getActivity().getString(R.string.giza_desc)
        };

        Integer[] imgid = {
                R.drawable.egyptian_meuseum,
                R.drawable.giza_plateau,
                R.drawable.great_sphinx,
                R.drawable.pyramids,
                R.drawable.pharonic_village,

        };
        for(int i=0;i<5;i++)
        {
            myItem item=new myItem(itemname[i],description[i],imgid[i]);
            myItemList.add(item);
        }

        itemAdapter adapter = new itemAdapter(GizaFragment.this.getActivity(), myItemList);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(GizaFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }

}
