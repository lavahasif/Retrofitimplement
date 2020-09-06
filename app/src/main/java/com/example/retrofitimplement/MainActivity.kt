package com.example.retrofitimplement


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitimplement.ApiService.HotelApi
import com.example.retrofitimplement.Model.KParticular
import com.example.retrofitimplement.Model.KotGModel
import com.example.retrofitimplement.ViewModel.ViewModel2
import com.google.gson.Gson
import com.shreyaspatil.MaterialDialog.AbstractDialog
import com.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog
import com.shreyaspatil.MaterialDialog.MaterialDialog
import com.shreyaspatil.MaterialDialog.interfaces.DialogInterface
import com.squareup.moshi.Moshi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ViewModel2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this, Mfactory()).get(ViewModel2::class.java)
        viewModel._response.observe(this, Observer {
            var data = ""
            it.forEach { ra ->
                data += ra.itemName
            }
            text.text = data
        })
    }

    inner class Mfactory : ViewModelProvider.Factory {
        override fun <T : androidx.lifecycle.ViewModel?> create(modelClass: Class<T>): T {
            return application.let { ViewModel2() } as T
        }

    }

    val parentJob = Job()
    val coroutineScope = CoroutineScope(Dispatchers.IO + parentJob)
    val list = ArrayList<KParticular>()
    fun clicked(view: View) {
        showdialogstart()

//        coroutineScope.launch {
//            var client = OkHttpClient().newBuilder()
//                .build()
//            var mediaType: MediaType? = MediaType.parse("application/json")
//            var body = RequestBody.create(
//                mediaType,
//                "{\r\n    \"usercode\": \"105498\",\r\n    \"itemName\": \"tut\",\r\n    \"catagory\": \"counter4\",\r\n    \"acRate\": 300.0000,\r\n    \"acdRate\": 300.0000,\r\n    \"nonacRATE\": 300.0000,\r\n    \"parcel\": 3500,\r\n    \"\": 5\r\n  \r\n}"
//            )
//            var request: Request = Request.Builder()
//                .url("http://192.168.43.84/api/product")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/json")
//                .build()
//            var response: Response = client.newCall(request).execute()
//        }

        coroutineScope.launch {
//            val moshi = Moshi.Builder().build()
//            val jsonAdapter: JsonAdapter<Products> =
//                moshi.adapter<Products>(Products::class.java) as

//            val retrofitservice = HotelApi.retrofitservice

//            retrofitservice.deleteproduct("123456")
//            Products(
//                "123456",
//                "rotten",
//                "dud",
//                3050.0000,
//                3050.0000,
//                3005.0000,
//                100.0000,
//                3050.0000,
//                "145"
//
//            )


//            val moshi = Moshi.Builder().build();
//
//            var type = Types.newParameterizedType(String().javaClass, KotGModel().javaClass)
//
//            var adapter = moshi.adapter<KotGModel>(type);
////            3. Get output

            val gson = Gson()

            var data = "{\n" +
                    "        \"BillNo\": 10001,\n" +
                    "        \"Date\": \"2020-08-09 00:00:00.000\",\n" +
                    "        \"Time\": \"2020-08-09 10:12:33.000\",\n" +
                    "        \"Waiter\": \"counter\",\n" +
                    "        \"KOTNo\": 10001,\n" +
                    "        \"Customer\": \"CASH\",\n" +
                    "        \"TotalAmount\": 67.0000,\n" +
                    "        \"Discount\": 0.0000,\n" +
                    "        \"OtherCharges\": 0.0000,\n" +
                    "        \"NetAmount\": 67.0000,\n" +
                    "        \"CreditAccount\": \"GENERAL BILLING A/C\",\n" +
                    "        \"Type\": \"N\",\n" +
                    "        \"printstatus\": \"Y\",\n" +
                    "        \"pgmType\": 0,\n" +
                    "        \"narration\": \"0\",\n" +
                    "        \"OBillNo\": 0,\n" +
                    "        \"VBillNo\": 0,\n" +
                    "        \"Duration\": 0.00,\n" +
                    "        \"table\": \"c1\",\n" +
                    "        \"cashrecieved\": 0,\n" +
                    "        \"balance\": 0,\n" +
                    "        \"cgst\": 1,\n" +
                    "        \"sgst\": 1,\n" +
                    "        \"settilmentstatus\": 1,\n" +
                    "        \"autoprint\": 1,\n" +
                    "        \"aps\": 0,\n" +
                    "        \"cardtype\": \"          \",\n" +
                    "        \"cardamount\": 0.00,\n" +
                    "        \"dinetype\": \"Dine In\",\n" +
                    "        \"serviceTAX\": 0,\n" +
                    "        \"floor\": 0,\n" +
                    "        \"kotstatus\": 0,\n" +
                    "        \"BankName\": \"\",\n" +
                    "        \"CardNumber\": \"\",\n" +
                    "        \"Net\": 65,\n" +
                    "        \"KFC\": 0,\n" +
                    "        \"Cess\": 0,\n" +
                    "        \"TockenNo\": 0,\n" +
                    "        \"PartyName\": \"\",\n" +
                    "        \"Padd1\": \"\",\n" +
                    "        \"Padd2\": \"\",\n" +
                    "        \"Padd3\": \"\",\n" +
                    "        \"PMobile\": \"\",\n" +
                    "        \"gst\": \"0\",\n" +
                    "        \"name\": \"NULL\",\n" +
                    "        \"mobno\": \"NULL\",\n" +
                    "        \"address\": \"NULL\",\n" +
                    "        \"roundoff\": \"NULL\",\n" +
                    "        \"note\": \"NULL\",\n" +
                    "        \"parcelno\": 0,\n" +
                    "        \"pservice\": \"\",\n" +
                    "        \"content\":[{\n" +
                    "             \n" +
                    "        \"Date\": \"2020-08-09 00:00:00.000\",\n" +
                    "        \"BillNo\": \"1\",\n" +
                    "        \"usercode\": \"257\",\n" +
                    "        \"ItemName\": \"BANANA CAKE\",\n" +
                    "        \"Rate\": \"40.0000\",\n" +
                    "        \"Qty\": \"1\",\n" +
                    "        \"Total\": \"42.0000\",\n" +
                    "        \"Auto\": \"2\",\n" +
                    "        \"Rrate\": \"40\",\n" +
                    "        \"Amount\": \"42\",\n" +
                    "        \"Tax\": \"2\",\n" +
                    "        \"ItemId\": \"254\",\n" +
                    "        \"Net\": \"40\",\n" +
                    "        \"CGST\": \"1\",\n" +
                    "        \"SGST\": \"1\",\n" +
                    "        \"KFC\": \"0\",\n" +
                    "        \"Cess\": \"0\"\n" +
                    "    \n" +
                    "\n" +
                    "        },\n" +
                    "        {\n" +
                    "        \"Date\": \"2020-08-09 00:00:00.000\",\n" +
                    "        \"BillNo\": \"2\",\n" +
                    "        \"usercode\": \"215\",\n" +
                    "        \"ItemName\": \"Karak Tea\",\n" +
                    "        \"Rate\": \"25.0000\",\n" +
                    "        \"Qty\": \"2\",\n" +
                    "        \"Total\": \"50.0000\",\n" +
                    "        \"Auto\": \"3\",\n" +
                    "        \"Rrate\": \"25\",\n" +
                    "        \"Amount\": \"50\",\n" +
                    "        \"Tax\": \"0\",\n" +
                    "        \"ItemId\": \"212\",\n" +
                    "        \"Net\": \"50\",\n" +
                    "        \"CGST\": \"0\",\n" +
                    "        \"SGST\": \"0\",\n" +
                    "        \"KFC\": \"0\",\n" +
                    "        \"Cess\": \"0\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"Date\": \"2020-08-09 00:00:00.000\",\n" +
                    "        \"BillNo\": \"3\",\n" +
                    "        \"usercode\": \"238\",\n" +
                    "        \"ItemName\": \"Karak M\",\n" +
                    "        \"Rate\": \"35.0000\",\n" +
                    "        \"Qty\": \"1\",\n" +
                    "        \"Total\": \"35.0000\",\n" +
                    "        \"Auto\": \"4\",\n" +
                    "        \"Rrate\": \"35\",\n" +
                    "        \"Amount\": \"35\",\n" +
                    "        \"Tax\": \"0\",\n" +
                    "        \"ItemId\": \"235\",\n" +
                    "        \"Net\": \"35\",\n" +
                    "        \"CGST\": \"0\",\n" +
                    "        \"SGST\": \"0\",\n" +
                    "        \"KFC\": \"0\",\n" +
                    "        \"Cess\": \"0\"\n" +
                    "    }\n" +
                    "        ]\n" +
                    "    }"


//            data =
//                "{\r\n        \"BillNo\": 10001,\r\n        \"Date\": \"2020-08-09 00:00:00.000\",\r\n        \"Time\": \"2020-08-09 10:12:33.000\",\r\n        \"Waiter\": \"counter\",\r\n        \"KOTNo\": 10001,\r\n        \"Customer\": \"CASH\",\r\n        \"TotalAmount\": 67.0000,\r\n        \"Discount\": 0.0000,\r\n        \"OtherCharges\": 0.0000,\r\n        \"NetAmount\": 67.0000,\r\n        \"CreditAccount\": \"GENERAL BILLING A/C\",\r\n        \"Type\": \"N\",\r\n        \"printstatus\": \"Y\",\r\n        \"pgmType\": 0,\r\n        \"narration\": \"0\",\r\n        \"OBillNo\": 0,\r\n        \"VBillNo\": 0,\r\n        \"Duration\": 0.00,\r\n        \"table\": \"c1\",\r\n        \"cashrecieved\": 0,\r\n        \"balance\": 0,\r\n        \"cgst\": 1,\r\n        \"sgst\": 1,\r\n        \"settilmentstatus\": 1,\r\n        \"autoprint\": 1,\r\n        \"aps\": 0,\r\n        \"cardtype\": \"          \",\r\n        \"cardamount\": 0.00,\r\n        \"dinetype\": \"Dine In\",\r\n        \"serviceTAX\": 0,\r\n        \"floor\": 0,\r\n        \"kotstatus\": 0,\r\n        \"BankName\": \"\",\r\n        \"CardNumber\": \"\",\r\n        \"Net\": 65,\r\n        \"KFC\": 0,\r\n        \"Cess\": 0,\r\n        \"TockenNo\": 0,\r\n        \"PartyName\": \"\",\r\n        \"Padd1\": \"\",\r\n        \"Padd2\": \"\",\r\n        \"Padd3\": \"\",\r\n        \"PMobile\": \"\",\r\n        \"gst\": \"0\",\r\n        \"name\": \"NULL\",\r\n        \"mobno\": \"NULL\",\r\n        \"address\": \"NULL\",\r\n        \"roundoff\": \"NULL\",\r\n        \"note\": \"NULL\",\r\n        \"parcelno\": 0,\r\n        \"pservice\": \"\",\r\n        \"content\":[{\r\n             \r\n        \"Date\": \"2020-08-09 00:00:00.000\",\r\n        \"BillNo\": \"1\",\r\n        \"usercode\": \"257\",\r\n        \"ItemName\": \"BANANA CAKE\",\r\n        \"Rate\": \"40.0000\",\r\n        \"Qty\": \"1\",\r\n        \"Total\": \"42.0000\",\r\n        \"Auto\": \"2\",\r\n        \"Rrate\": \"40\",\r\n        \"Amount\": \"42\",\r\n        \"Tax\": \"2\",\r\n        \"ItemId\": \"254\",\r\n        \"Net\": \"40\",\r\n        \"CGST\": \"1\",\r\n        \"SGST\": \"1\",\r\n        \"KFC\": \"0\",\r\n        \"Cess\": \"0\"\r\n    \r\n\r\n        },\r\n        {\r\n        \"Date\": \"2020-08-09 00:00:00.000\",\r\n        \"BillNo\": \"2\",\r\n        \"usercode\": \"215\",\r\n        \"ItemName\": \"Karak Tea\",\r\n        \"Rate\": \"25.0000\",\r\n        \"Qty\": \"2\",\r\n        \"Total\": \"50.0000\",\r\n        \"Auto\": \"3\",\r\n        \"Rrate\": \"25\",\r\n        \"Amount\": \"50\",\r\n        \"Tax\": \"0\",\r\n        \"ItemId\": \"212\",\r\n        \"Net\": \"50\",\r\n        \"CGST\": \"0\",\r\n        \"SGST\": \"0\",\r\n        \"KFC\": \"0\",\r\n        \"Cess\": \"0\"\r\n    },\r\n    {\r\n        \"Date\": \"2020-08-09 00:00:00.000\",\r\n        \"BillNo\": \"3\",\r\n        \"usercode\": \"238\",\r\n        \"ItemName\": \"Karak M\",\r\n        \"Rate\": \"35.0000\",\r\n        \"Qty\": \"1\",\r\n        \"Total\": \"35.0000\",\r\n        \"Auto\": \"4\",\r\n        \"Rrate\": \"35\",\r\n        \"Amount\": \"35\",\r\n        \"Tax\": \"0\",\r\n        \"ItemId\": \"235\",\r\n        \"Net\": \"35\",\r\n        \"CGST\": \"0\",\r\n        \"SGST\": \"0\",\r\n        \"KFC\": \"0\",\r\n        \"Cess\": \"0\"\r\n    }\r\n        ]\r\n    }"


//            val va: Type = object : TypeToken<KotGModel?>() {}.type
//            val fromJson = gson.fromJson<KotGModel>(data, va)
            val moshi = Moshi.Builder().build();

//            var type = Types.newParameterizedType(String().javaClass, KotGModel().javaClass)

//            var adapter = moshi.adapter<KotGModel>(type);
//            var fromJson = adapter.fromJson(data);

            list.add(KParticular().apply {

                date = "2020-08-09 00=00=00.000"
                billno = 1
                usercode = "257"
                itemName = "BANANA CAKE"
                rate = 40.0000
                qty = "1"
                total = 42.0000

                rrate = 40.0

                tax = 2.0
                itemid = "254"
                net = 40.0


            })
            list.add(KParticular().apply {

                date = "2020-08-09 00=00=00.000"
                billno = 1
                usercode = "211"
                itemName = "Expresso"
                rate = 41.0000
                qty = "1"
                total = 45.0000

                rrate = 41.0

                tax = 2.0
                itemid = "254"
                net = 41.0


            })
            list.add(KParticular().apply {

                date = "2020-08-09 00=00=00.000"
                billno = 1
                usercode = "238"
                itemName = "Karak M"
                rate = 25.0000
                qty = "1"
                total = 45.0000

                rrate = 25.0

                tax = 1.0
                itemid = "238"
                net = 21.0


            })
            var fromJson = KotGModel()
            fromJson.apply {
                billno = 10001
                date = "2020-08-09 00:00:00.000"
                time = "2020-08-09 00:00:00.000"
                waiter = "counter"
                kotno = 10001
                customer = "cash"
                totalAmount = 67.00
                discount = 67.00
                otherCharges = 67.00
                otherCharges = 67.00
                netAmount = 67.00
                creditAccount = "GENERAL BILLING A/C"
                type = "N"
                printstatus = "Y"
                pgmType = 0
                narration = ""
                oBillNo = 0
                vBillNo = 0
                duration = 0.0
                table = "c2"
                cashrecieved = 0.0
                balance = 0.0
                cgst = 0.0
                cgst = 0.0
                settilmentstatus = 1
                autoprint = 1
                aps = 0
                cardtype = "ff"
                cardamount = 0.0
                dinetype = "dine in"
                serviceTAX = 0.0
                floor = 0
                floor = 0
                kotstatus = 0
                bankName = "sib"
                cardNumber = "12345"
                net = 0.0
                cess = 0.0
                tockenNo = 0
                name = "ha"
                mobno = "9645"
                address = "9645"
                parcelno = 0

                content = list

            }

            val settProducts = fromJson?.let { HotelApi.retrofitservice.setKot(it) }
            settProducts?.enqueue(object : Callback<KotGModel> {
                override fun onResponse(call: Call<KotGModel>, response: Response<KotGModel>) {
                    mDialog.dismiss()
                    bottom()
                    Toast.makeText(
                        applicationContext,
                        response.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onFailure(call: Call<KotGModel>, t: Throwable) {
                    mDialog.dismiss()
                    showdialog2("NetWork Error not connecting")
                    Toast.makeText(
                        applicationContext,
                        "suc" + t.printStackTrace(),
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
            )


        }

        /**
        POST name and job Url encoded.
         **/
//        Call<UserList> call3 = apiInterface.doCreateUserWithField("morpheus","leader");
//        call3.enqueue(new Callback<UserList>() {
//            @Override
//            public void onResponse(Call<UserList> call, Response<UserList> response) {
//                UserList userList = response.body();
//                Integer text = userList.page;
//                Integer total = userList.total;
//                Integer totalPages = userList.totalPages;
//                List<UserList.Datum> datumList = userList.data;
//                Toast.makeText(getApplicationContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();
//
//                for (UserList.Datum datum : datumList) {
//                Toast.makeText(getApplicationContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
//            }
//
//            }
//
//            @Override
//            public void onFailure(Call<UserList> call, Throwable t) {
//                call.cancel();
//            }
//        });
//
//    }
    }

    fun showdialog() {
//        val mDialog = MaterialDialog.Builder(this)
//            .setTitle("Delete?")
//            .setMessage("Are you sure want to delete this file?")
//            .setCancelable(false)
//            .setPositiveButton(
//                "Delete", R.drawable.ic_launcher_background
//            ) { dialogInterface, which ->
//                // Delete Operation
//            }
//            .setNegativeButton(
//                "Cancel", R.drawable.ic_launcher_background
//            ) { dialogInterface, which -> dialogInterface.dismiss() }
//            .build()

        val builder = MaterialDialog.Builder(this)


        mDialog = builder
            .setTitle("Bill Added")
            .setMessage("bill no 1965")
            .setCancelable(false)
            .setAnimation("done.json")
            .setPositiveButton(
                "print",
                R.drawable.ic_parcel,
                AbstractDialog.OnClickListener { dialogInterface, which ->
                    dialogInterface.dismiss()
                    sh()
//                mDialog
//                findViewById<TextView>(R.id.textView_title).text="Print"
                    mDialog = builder.setTitle("Printing").setMessage("").build()
                    mDialog.show()

                })
            .setNegativeButton(
                "Cancel", R.drawable.ic_parcel
            ) { dialogInterface, which -> dialogInterface.dismiss() }
            .build()

        // Show Dialog

        // Show Dialog
        mDialog.show()
//        Thread.sleep(10000)


    }


    fun bottom() {
        mDialog.dismiss()
        val mBottomSheetDialog = BottomSheetMaterialDialog.Builder(this)
            .setTitle("Congrages ")
            .setMessage("Billno:1964\nkotno:5426")
            .setCancelable(false)
            .setAnimation("done.json")
            .setPositiveButton(
                "Delete", R.drawable.ic_parcel
            ) { dialogInterface, which ->
                Toast.makeText(applicationContext, "Deleted!", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }
            .setNegativeButton(
                "Cancel",
                R.drawable.ic_parcel
            ) { dialogInterface, which ->
                Toast.makeText(applicationContext, "Cancelled!", Toast.LENGTH_SHORT).show()
                dialogInterface.dismiss()
            }
            .build()

        // Show Dialog

        // Show Dialog
        mBottomSheetDialog.show()
    }

    fun showdialogstart() {
//        val mDialog = MaterialDialog.Builder(this)
//            .setTitle("Delete?")
//            .setMessage("Are you sure want to delete this file?")
//            .setCancelable(false)
//            .setPositiveButton(
//                "Delete", R.drawable.ic_launcher_background
//            ) { dialogInterface, which ->
//                // Delete Operation
//            }
//            .setNegativeButton(
//                "Cancel", R.drawable.ic_launcher_background
//            ) { dialogInterface, which -> dialogInterface.dismiss() }
//            .build()

        val builder = MaterialDialog.Builder(this)


        mDialog = builder

            .setCancelable(false)
            .setAnimation("loading.json")

            .build()

        // Show Dialog

        // Show Dialog
        mDialog.show()
//        Thread.sleep(10000)


    }

    lateinit var mDialog: MaterialDialog
    fun sh() {
        val animationView = mDialog.animationView
        animationView.setAnimation("print.json")
        animationView.playAnimation()


//        mDialog.show()
    }

    fun showdialog2(messge: String) {
//        val mDialog = MaterialDialog.Builder(this)
//            .setTitle("Delete?")
//            .setMessage("Are you sure want to delete this file?")
//            .setCancelable(false)
//            .setPositiveButton(
//                "Delete", R.drawable.ic_launcher_background
//            ) { dialogInterface, which ->
//                // Delete Operation
//            }
//            .setNegativeButton(
//                "Cancel", R.drawable.ic_launcher_background
//            ) { dialogInterface, which -> dialogInterface.dismiss() }
//            .build()
        val mDialog = MaterialDialog.Builder(this)
//            .setTitle("Delete?")
            .setMessage(messge)
            .setCancelable(false)
            .setAnimation("networkerror.json")
            .setPositiveButton(
                "", R.drawable.ic_parcel
            ) { dialogInterface, which ->
                dialogInterface
                dialogInterface.dismiss()
                clicked(this.text)
            }
            .setNegativeButton(
                "Cancel", R.drawable.ic_parcel
            ) { dialogInterface, which -> dialogInterface.dismiss() }
            .build()

        // Show Dialog

        // Show Dialog
        mDialog.show()
    }

    val Clicklistner = object : AbstractDialog.OnClickListener {
        override fun onClick(dialogInterface: DialogInterface?, which: Int) {

            mDialog.animationView.setAnimation("sucess.json")


//            mDialog.show()

            // Delete Operation

        }

    }
}



