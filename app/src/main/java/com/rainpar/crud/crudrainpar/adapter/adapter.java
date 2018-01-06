package com.rainpar.crud.crudrainpar.adapter;

/**
 * Created by RAINPAR on 06/01/2018.
 */

        import android.app.Activity;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import com.androidbelajar.catatan.R;
        import com.androidbelajar.catatan.getset.Data;

        import java.util.List;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public Adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView judul = (TextView) convertView.findViewById(R.id.judul);
        TextView isi = (TextView) convertView.findViewById(R.id.isi);

        Data data = items.get(position);

        id.setText(data.getId());
        judul.setText(data.getJudul());
        isi.setText(data.getIsi());

        return convertView;
    }

}