package com.example.admin.danhbadienthoai;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ListContacts extends Fragment {
    RecyclerView recyclerView;
    ArrayList<ItemContacts> arrayList ;
    CustomRecycleView customRecycleView;
    ListView listView;
    public ListContacts() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        arrayList = new ArrayList<ItemContacts>();
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
        arrayList.add(new ItemContacts("Quang","0977897942",true));
        arrayList.add(new ItemContacts("Tuấn","0977897942",true));
        arrayList.add(new ItemContacts("Hoa","0977897942",false));
//        customRecycleView= new CustomRecycleView(arrayList, getContext());
//        recyclerView= (RecyclerView)getView().findViewById(R.id.recycler);
//        recyclerView.setHasFixedSize(false);
//        LinearLayoutManager llm = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(llm);
//        recyclerView.setAdapter(customRecycleView);
        listView = (ListView)getView().findViewById(R.id.listview);
        CustomListView customListView = new CustomListView(getActivity(),R.layout.activity_item_contacts,arrayList);
        listView.setAdapter(customListView);

        return inflater.inflate(R.layout.activity_list_contacts, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

    }
}
