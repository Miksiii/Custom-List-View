package customlistadapter.metropolitan.fit.rs.customlistadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView eventsListView;
    private EventAdapter eventsAdapter;
    private List<Event> eventsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onListItemListener();
    }

    private void init() {
        eventsListView = (ListView) findViewById(R.id.eventsListView);
        eventsList = new ArrayList<>();

        eventsList.add(new Event("Football", "04-05-2016", "22:00", 22434, 43434, 10));
        eventsList.add(new Event("Basketball", "02-11-2016", "12:00", 2234, 34, 8));
        eventsList.add(new Event("Bejzbol", "04-05-2016", "11:00", 2244, 5434, 10));
        eventsList.add(new Event("Futsal", "04-05-2016", "15:00", 224, 134, 15));
        eventsList.add(new Event("Waterpolo", "04-05-2016", "22:30", 4314, 3434, 10));
        eventsList.add(new Event("Kriket", "04-05-2016", "20:00", 2634, 4434, 10));
        eventsList.add(new Event("Volleyball", "04-05-2016", "21:00", 1334, 4434, 5));

        eventsAdapter = new EventAdapter(getApplicationContext(), eventsList);
        eventsListView.setAdapter(eventsAdapter);
    }

    public void onListItemListener() {
        eventsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        Toast.makeText(MainActivity.this, "You clicked on (position at " + position + "): "
                                + eventsList.get(position).getTitle() + ", "
                                + eventsList.get(position).getTime() + ", "
                                + eventsList.get(position).getRequiredPeople(),
                                Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
