package com.example.basic;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner semesterSpinner;
    private TextView cgpaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        semesterSpinner = findViewById(R.id.semesterSpinner);
        cgpaTextView = findViewById(R.id.cgpaTextView);

        // Populate the Spinner with the list of semesters
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.semesters_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        semesterSpinner.setAdapter(adapter);

        // Set OnItemSelectedListener for the Spinner
        semesterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Handle selection of semester
                String selectedSemester = parentView.getItemAtPosition(position).toString();

                // Update TextView with CGPA for the selected semester
                updateCGPA(selectedSemester);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing
            }
        });
    }

    // Method to update TextView with CGPA for the selected semester
    private void updateCGPA(String selectedSemester) {
        String cgpa;
        switch (selectedSemester) {
            case "sem1":
                cgpa = "8.25";
                break;
            case "sem2":
                cgpa = "8.5";
                break;
            case "sem3":
                cgpa = "9";
                break;
            case "sem4":
                cgpa = "8.75";
                break;
            default:
                cgpa = "N/A";
                break;
        }

        String cgpaText = getString(R.string.cgpa) + cgpa;
        cgpaTextView.setText(cgpaText);
    }
}