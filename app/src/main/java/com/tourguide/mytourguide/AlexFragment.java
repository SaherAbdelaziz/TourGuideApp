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

public class AlexFragment extends Fragment {
    ArrayList<myItem> myItemList;
    public AlexFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.list_of_myitems, container, false);
        myItemList=new ArrayList<>();
        ListView list;

        final String[] itemname = {
                getActivity().getString(R.string.Bibliotheca),
                getActivity().getString(R.string.Catacombs),
                getActivity().getString(R.string.Montazah),
                getActivity().getString(R.string.pompeyes),
                getActivity().getString(R.string.Qaitbey)

        };
        final String[] description = {
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria),
                getActivity().getString(R.string.Alexandria)

        };

        Integer[] imgid = {
                R.drawable.bibliotheca_alex,
                R.drawable.catacombs_of_kom_hokafa,
                R.drawable.montazah_palace,
                R.drawable.pompeyes_pillar,
                R.drawable.qaitbay_citadel

        };

        for(int i=0;i<5;i++)
        {
            myItem item=new myItem(itemname[i],description[i],imgid[i]);
            myItemList.add(item);
        }

        list = (ListView) view.findViewById(R.id.list);
        itemAdapter adapter = new itemAdapter(AlexFragment.this.getActivity(),myItemList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String Slecteditem = itemname[+position];
                Toast.makeText(AlexFragment.this.getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}