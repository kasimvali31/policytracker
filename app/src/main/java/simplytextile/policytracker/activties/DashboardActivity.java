package simplytextile.policytracker.activties;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import simplytextile.policytracker.R;
import simplytextile.policytracker.adapters.CustomerListAdapter;
import simplytextile.policytracker.apis.ApiClient;
import simplytextile.policytracker.apis.ApiService;
import simplytextile.policytracker.dashboardresponse.DashbordResonse;
import simplytextile.policytracker.response.CustomerResponse;

public class DashboardActivity extends AppCompatActivity
{
public static  String count;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        SharedPreferences mPrefs = getSharedPreferences("IDvalue",0);
        String S_id = mPrefs.getString("key", "");

        ApiService planView = ApiClient.getClient().create(ApiService.class);
        Call<DashbordResonse> customers=planView.getDashboarddata(S_id);
        customers.enqueue(new Callback<DashbordResonse>()
        {
            @Override
            public void onResponse(Call<DashbordResonse> call, Response<DashbordResonse> response)
            {
                if (response.body().getStatuscode()==0)
                {
                    Toast.makeText(DashboardActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(DashboardActivity.this, ""+response.body().getData().getDashboard().getDataset().get(0).getRowlist().get(0).getCount(), Toast.LENGTH_SHORT).show();
                  count= String.valueOf(response.body().getData().getDashboard().getDataset().get(7).getRowlist().get(0).getDescription());
                    count= String.valueOf(response.body().getData().getDashboard().getDataset().get(7).getRowlist().get(0).getCount());


                }
                else
                {
                    Toast.makeText(DashboardActivity.this, "from else"+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<DashbordResonse> call, Throwable t)
            {
                Toast.makeText(DashboardActivity.this, "something went wrong", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
