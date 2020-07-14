package sg.edu.rp.c346.id_18021531.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<todoitem> todoitem;


    public customAdapter(Context context, int resource, ArrayList<todoitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        todoitem = objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvtitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvdate = rowView.findViewById(R.id.textViewdate);

        // Obtain the Android Version information based on the position


        // Set values to the TextView to display the corresponding information
        tvtitle.setText(todoitem.get(position).getTitle());

        tvdate.setText(todoitem.get(position).toString());

        return rowView;
    }


}
