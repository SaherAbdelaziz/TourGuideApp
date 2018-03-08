package com.tourguide.mytourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by SaherOs on 1/25/2018.
 */

public class CairoFragment extends Fragment {
    ArrayList<myItem> myItemList;

    public CairoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_of_myitems, container, false);
        myItemList=new ArrayList<>();
        ListView list;
        final String[] itemname = {
                getActivity().getString(R.string.Ebn),
                getActivity().getString(R.string.AL_azhar),
                getActivity().getString(R.string.Manial),
                getActivity().getString(R.string.Msjed),
                getActivity().getString(R.string.Tahrir)

        };
        final String[] description = {
                getActivity().getString(R.string.Cairo),
                getActivity().getString(R.string.Cairo),
                getActivity().getString(R.string.Cairo),
                getActivity().getString(R.string.Cairo),
                getActivity().getString(R.string.Cairo),

        };

        Integer[] imgid = {
                R.drawable.ebn_tulan,
                R.drawable.azhar_park,
                R.drawable.manial_palace,
                R.drawable.msjed_sultan,
                R.drawable.tahrir_square,

        };

        for(int i=0;i<5;i++)
        {
            myItem item=new myItem(itemname[i],description[i],imgid[i]);
            myItemList.add(item);
        }
        itemAdapter adapter = new itemAdapter(CairoFragment.this.getActivity(),myItemList);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(CairoFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}