package com.example.rakesh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    int[] IMAGE={R.drawable.person24dp,R.drawable.person24dp,R.drawable.person24dp,
            R.drawable.person24dp,R.drawable.person24dp,R.drawable.person24dp,R.drawable.person24dp,
            R.drawable.person24dp,R.drawable.person24dp,R.drawable.person24dp};

    String[] NAME={"BIG B","GANDHI","GOPICHAND","APJ KALAM",
            "KALPANA CHAWLA","A R RAHMAN","SACHIN","Lata Mangeshkar","TATA","VAJPEY"};

    String[] DESCRIPTION={"Actor","Freedom Fighter","Sports","Scientist",
              "Austonot","Music Actor","cricket","Singer","TATA motors","former PM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listview);
        CustomAdaptor customAdaptor=new CustomAdaptor();
        listView.setAdapter(customAdaptor);

        }
    class CustomAdaptor  extends BaseAdapter{
        @Override
        public int getCount(){
            return IMAGE.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }


        public long getItemId(int i){

            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.costemlayout, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView_1);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGE[i]);
            textView_name.setText(NAME[i]);
            textView_description.setText(DESCRIPTION[i]);
            return view;
        }



    }
}

