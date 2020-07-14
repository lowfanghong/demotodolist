package sg.edu.rp.c346.id_18021531.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<todoitem> alTodo;
    customAdapter catodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItem  = findViewById(R.id.listviewtodo);
        alTodo = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        todoitem item1 = new todoitem("Go for movie",date1);
        todoitem item2 = new todoitem("Go for haircut",date2);

              alTodo.add(item1);
              alTodo.add(item2);
     catodo = new customAdapter(this,R.layout.row,alTodo);
            lvItem.setAdapter(catodo);

    }
}
