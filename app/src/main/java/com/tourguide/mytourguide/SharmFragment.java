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
public class SharmFragment extends Fragment {
    ArrayList<myItem> myItemList;


    public SharmFragment() {
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
                getActivity().getString(R.string.alf),
                getActivity().getString(R.string.Akwa),
                getActivity().getString(R.string.Safari),
                getActivity().getString(R.string.Al_souq),
                getActivity().getString(R.string.khaleg)
        };
        final String[] description = {
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh),
                getActivity().getString(R.string.Sharm_Elsheikh)
        };

        Integer[] imgid = {
                R.drawable.alf_lyala,
                R.drawable.akwa_park,
                R.drawable.safari,
                R.drawable.alsouq_elsha3bi,
                R.drawable.khaleg_ne3ma,

        };
        for(int i=0;i<5;i++)
        {
            myItem item=new myItem(itemname[i],description[i],imgid[i]);
            myItemList.add(item);
        }

        itemAdapter adapter = new itemAdapter(SharmFragment.this.getActivity(), myItemList);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(SharmFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
