package slode.elsloude.testemployees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import slode.elsloude.testemployees.adapters.EmployeeAdapter;
import slode.elsloude.testemployees.pojo.Employee;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEmloyees;
    private EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewEmloyees = findViewById(R.id.recyclerViewEmployees);
        adapter = new EmployeeAdapter();
        recyclerViewEmloyees.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewEmloyees.setAdapter(adapter);
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setName("Иван");
        employee1.setLName("Иванов");
        employee2.setName("Андрей");
        employee2.setLName("Баранович");
        employees.add(employee1);
        employees.add(employee2);
        adapter.setEmployee(employees);

    }
}