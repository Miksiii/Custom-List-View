package customlistadapter.metropolitan.fit.rs.customlistadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Milan on 8/13/2016.
 */
public class EventAdapter extends BaseAdapter {

    private Context ctx;
    private List<Event> eventsList;

    private TextView eTitle, eTime, eDate, eLon, eLat, eRequiredPeople;

    public EventAdapter(Context ctx, List<Event> eventsList) {
        this.ctx = ctx;
        this.eventsList = eventsList;
    }

    @Override
    public int getCount() {
        return eventsList.size();
    }

    @Override
    public Object getItem(int position) {
        return eventsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View v = View.inflate(ctx, R.layout.partials_event, null);
        initGui(v);

        eTitle.setText(eventsList.get(position).getTitle());
        eTime.setText(eventsList.get(position).getTime());
        eDate.setText(eventsList.get(position).getDate());
        eLon.setText(String.valueOf(eventsList.get(position).getLon()));
        eLat.setText(String.valueOf(eventsList.get(position).getLat()));
        eRequiredPeople.setText(String.valueOf(eventsList.get(position).getRequiredPeople()));

        return v;

    }

    private void initGui(View view) {
        eTitle = (TextView) view.findViewById(R.id.eTitle);
        eTime  = (TextView) view.findViewById(R.id.eTime);
        eDate = (TextView) view.findViewById(R.id.eDate);
        eLon = (TextView) view.findViewById(R.id.eLon);
        eLat = (TextView) view.findViewById(R.id.eLat);
        eRequiredPeople = (TextView) view.findViewById(R.id.eRequiredPeople);
    }
}
