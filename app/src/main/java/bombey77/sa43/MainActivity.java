package bombey77.sa43;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String LOG = "myLog";

    String[] names;
    ListView listView;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(this);

        names = getResources().getStringArray(R.array.nameList);

        listView = (ListView) findViewById(R.id.listView);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nameList, android.R.layout.simple_list_item_single_choice);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        Log.d(LOG, "Result is " + names[listView.getCheckedItemPosition()]);
    }
}
