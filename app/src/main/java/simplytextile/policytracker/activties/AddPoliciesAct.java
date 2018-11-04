package simplytextile.policytracker.activties;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;

import org.json.JSONException;
import org.json.JSONObject;

import simplytextile.policytracker.R;
import simplytextile.policytracker.Utills;
import simplytextile.policytracker.VolleyCallback;

public class AddPoliciesAct extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_policies);

        JSONObject main=new JSONObject();
        JSONObject sub_main=new JSONObject();
        try
        {
            sub_main.put("id","");
            sub_main.put("description","");
            sub_main.put("policy_number","");
            sub_main.put("commission_amount","");
            sub_main.put("beneficiary_information","");
            sub_main.put("grace_days","");
            sub_main.put("parent_id","");

            JSONObject json_customer=new JSONObject();
            json_customer.put("id","");
            json_customer.put("business_name","");
            json_customer.put("first_name","");
            json_customer.put("last_name","");
            json_customer.put("aadhar_number","");
            json_customer.put("govt_id_number","");
            json_customer.put("date_of_birth","");

            JSONObject json_cust_addrs=new JSONObject();
            json_cust_addrs.put("address1","");
            json_cust_addrs.put("address2","");
            json_cust_addrs.put("address3","");
            json_cust_addrs.put("city","");
            json_cust_addrs.put("state","");
            json_cust_addrs.put("zip","");
            json_cust_addrs.put("email1","");
            json_cust_addrs.put("phone1","");
            json_cust_addrs.put("email2","");
            json_cust_addrs.put("phone2","");

            json_customer.put("address",json_cust_addrs);

            JSONObject json_cust_agent=new JSONObject();
            json_cust_agent.put("id","");
            json_cust_agent.put("business_name","");
            json_cust_agent.put("first_name","");
            json_cust_agent.put("last_name","");
            json_cust_agent.put("aadhar_number","");
            json_cust_agent.put("govt_id_number","");
            JSONObject json_cust_addrs1=new JSONObject();
            json_cust_addrs1.put("address1","");
            json_cust_addrs1.put("address2","");
            json_cust_addrs1.put("address3","");
            json_cust_addrs1.put("city","");
            json_cust_addrs1.put("state","");
            json_cust_addrs1.put("zip","");
            json_cust_addrs1.put("email1","");
            json_cust_addrs1.put("phone1","");
            json_cust_addrs1.put("email2","");
            json_cust_addrs1.put("phone2","");
            json_cust_agent.put("address",json_cust_addrs1);
            json_customer.put("agent",json_cust_agent);


            JSONObject json_agent=new JSONObject();
            json_agent.put("id","");
            json_agent.put("business_name","");
            json_agent.put("first_name","");
            json_agent.put("last_name","");
            json_agent.put("aadhar_number","");
            json_agent.put("govt_id_number","");

            JSONObject json_agent_addres=new JSONObject();
            json_agent_addres.put("address1","");
            json_agent_addres.put("address2","");
            json_agent_addres.put("address3","");
            json_agent_addres.put("city","");
            json_agent_addres.put("state","");
            json_agent_addres.put("zip","");
            json_agent_addres.put("email1","");
            json_agent_addres.put("phone1","");
            json_agent_addres.put("email2","");
            json_agent_addres.put("phone2","");
            json_agent.put("address",json_cust_addrs1);


            JSONObject json_company=new JSONObject();
            json_company.put("id","");
            json_company.put("first_name","");
            json_company.put("last_name","");
            json_company.put("business_name","");
            json_company.put("status_id","");
            json_company.put("irdai_number","");
            json_company.put("govt_id_number","");
            json_company.put("created","");
            json_company.put("last_updated","");
            json_company.put("update_counter","");

            JSONObject json_comp_address=new JSONObject();
            json_comp_address.put("address1","");
            json_comp_address.put("address2","");
            json_comp_address.put("address3","");
            json_comp_address.put("city","");
            json_comp_address.put("state","");
            json_comp_address.put("zip","");
            json_comp_address.put("email1","");
            json_comp_address.put("phone1","");
            json_comp_address.put("email2","");
            json_comp_address.put("phone2","");
            json_comp_address.put("update_counter","");
            json_comp_address.put("created","");
            json_comp_address.put("last_updated","");
            json_company.put("address",json_comp_address);

            JSONObject jmmore=new JSONObject();
            json_company.put("more",jmmore);

            JSONObject json_comp_policytyep=new JSONObject();
            json_comp_policytyep.put("id","");
            json_comp_policytyep.put("name","");
            json_comp_policytyep.put("description","");
            json_comp_policytyep.put("parent_id","");
            json_comp_policytyep.put("is_renewable","");
            json_comp_policytyep.put("renewal_notice_days","");

            json_company.put("policy_type",json_comp_policytyep);

            JSONObject json_insuredInfo=new JSONObject();
            json_insuredInfo.put("id","");
            json_insuredInfo.put("value","");
            json_insuredInfo.put("identification","");

            JSONObject json_premium_info=new JSONObject();
            json_premium_info.put("id","");
            json_premium_info.put("period_number","");
            json_premium_info.put("next_payment_due_date","");
            json_premium_info.put("last_payment_date","");
            json_premium_info.put("amount","");
            json_premium_info.put("end_date","");
            json_premium_info.put("renewal_amount","");

            JSONObject json_covergInfo=new JSONObject();
            json_covergInfo.put("id","");
            json_covergInfo.put("period_number","");
            json_covergInfo.put("start_date","");
            json_covergInfo.put("value","");
            json_covergInfo.put("end_date","");

            JSONObject json_policyStatus=new JSONObject();
            json_policyStatus.put("id","");
            json_policyStatus.put("name","");
            json_policyStatus.put("description","");


            JSONObject json_policyTYpe=new JSONObject();
            json_policyTYpe.put("id","");
            json_policyTYpe.put("name","");
            json_policyTYpe.put("description","");
            json_policyTYpe.put("parent_id","");
            json_policyTYpe.put("is_renewable","");

            JSONObject json_ptype_sub=new JSONObject();
            json_ptype_sub.put("id","");
            json_ptype_sub.put("name","");
            json_ptype_sub.put("description","");
            json_ptype_sub.put("parent_id","");


            JSONObject json_more=new JSONObject();
            json_more.put("vehicle_make","");
            json_more.put("vehicle_model","");
            json_more.put("vehicle_year","");
            json_more.put("vehicle_license_plate","");

            JSONObject json_notification=new JSONObject();
            json_notification.put("emails","");
            json_notification.put("phone","");
            json_notification.put("phone_flag","");
            json_notification.put("email_flag","");


            sub_main.put("notification_info",json_notification);
            sub_main.put("more",json_more);
            sub_main.put("policy_type_sub",json_ptype_sub);
            sub_main.put("policy_type",json_policyTYpe);
            sub_main.put("policy_status",json_policyStatus);
            sub_main.put("coverage_info",json_covergInfo);
            sub_main.put("premium_info",json_premium_info);
            sub_main.put("insured_info",json_insuredInfo);
            sub_main.put("company",json_company);
            sub_main.put("agent",json_agent);
            sub_main.put("customer",json_customer);
            main.put("policy",sub_main);

            Utills.getVolleyResponseJson(AddPoliciesAct.this, Request.Method.POST, "http://dev.simplytextile.com:9081/api/policies", main, new VolleyCallback() {
                @Override
                public void onSuccessResponse(String result)
                {
                    JSONObject jb = null;
                    try
                    {
                        jb = new JSONObject(result);
                        String msg=jb.getString("message");
                        Toast.makeText(AddPoliciesAct.this, " "+msg, Toast.LENGTH_SHORT).show();
                    }
                    catch (JSONException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        } catch (JSONException e)
        {
            e.printStackTrace();
        }


    }
}
