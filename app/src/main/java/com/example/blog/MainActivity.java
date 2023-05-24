import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] articles = {"Article 1", "Article 2", "Article 3", "Article 4", "Article 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, articles);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedArticle = articles[position];
                Toast.makeText(MainActivity.this, "Article sélectionné : " + selectedArticle, Toast.LENGTH_SHORT).show();
                // Ajoutez ici le code pour afficher les détails de l'article sélectionné
            }
        });

        FloatingActionButton addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ajouter un nouvel article", Toast.LENGTH_SHORT).show();
                // Ajoutez ici le code pour ajouter un nouvel article
            }
        });
    }
}
