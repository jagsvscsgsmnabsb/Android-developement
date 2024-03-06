import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practice_android.Contactmodel;
import com.example.practice_android.R;
import java.util.ArrayList;
public class RecyclerContactAdapter  extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>
{
Context context;
    ArrayList<Contactmodel> arraycontact;
    public  RecyclerContactAdapter.ViewHolder ViewHolder;

   public  RecyclerContactAdapter(Context  context , ArrayList<Contactmodel> arraycontact)
    {
        this.context = context;
        this.arraycontact = arraycontact;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
       ViewHolder viewHolder = new ViewHolder(view) ;
 return ViewHolder;



    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

holder.imgContact.setImageResource(arraycontact.get(position).img);
holder.txtName.setText(arraycontact.get(position).name);
holder.txtNumber.setText(arraycontact.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arraycontact.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
TextView txtName, txtNumber;
ImageView imgContact;
        public ViewHolder(@NonNull View itemview) {
            super(itemview);

            txtName = itemview.findViewById(R.id.txtName);
            txtNumber = itemview.findViewById(R.id.txtnumber);
           imgContact = itemview.findViewById(R.id.img1Contact);

        }


    }
}
