package slode.elsloude.testemployees.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

import slode.elsloude.testemployees.R;
import slode.elsloude.testemployees.pojo.Employee;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.employeeViewHolder> {

    private List<Employee> employees;

    public List<Employee> getEmployee() {
        return employees;
    }

    public void setEmployee(List<Employee> employee) {
        this.employees = employee;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public employeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_item, parent, false);
        return new employeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull employeeViewHolder holder, int position) {
        Employee employee = employees.get(position);
        holder.textViewName.setText(employee.getName());
        holder.textViewLastName.setText(employee.getLName());

    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class employeeViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewName;
        private TextView textViewLastName;

        public employeeViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewLastName = itemView.findViewById(R.id.textViewLastName);


        }
    }
}
