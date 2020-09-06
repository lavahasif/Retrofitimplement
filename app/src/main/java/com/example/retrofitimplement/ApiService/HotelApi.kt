package com.example.retrofitimplement.ApiService


import com.example.retrofitimplement.Model.KotGModel
import com.example.retrofitimplement.Model.Products
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
    this.level = HttpLoggingInterceptor.Level.BODY
}
val client: OkHttpClient = OkHttpClient.Builder().apply {
    this.addInterceptor(interceptor)
}.build()

//private const val BASE_URL = "http://192.168.43.84/api/"

private const val BASE_URL = "http://192.168.1.105/api/"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit =
    Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(
        BASE_URL
    ).client(client).build()

//var client = OkHttpClient().newBuilder()
//    .build()
//var mediaType: MediaType = MediaType.parse("application/json")
//var body = RequestBody.create(
//    mediaType,
//    "{\r\n    \"usercode\": \"1054\",\r\n    \"itemName\": \"tut\",\r\n    \"catagory\": \"counter4\",\r\n    \"acRate\": 300.0000,\r\n    \"acdRate\": 300.0000,\r\n    \"nonacRATE\": 300.0000,\r\n    \"parcel\": 3500,\r\n    \"\": 5\r\n  \r\n}"
//)
//var request: Request = Builder()
//    .url("https://localhost:5001/api/product")
//    .method("POST", body)
//    .addHeader("Content-Type", "application/json")
//    .build()
//var response: Response = client.newCall(request).execute()

interface HotelApiService {
    @GET("product")
    suspend fun getProducts(): List<Products>


    @POST("product")
    fun settProducts(@Body products: Products): Response<Products>

    @POST("kot")
    fun setKot(@Body kotdata: KotGModel): Call<KotGModel>

    @PUT("product/{id}")
    suspend fun updateProduct(@Path("id") id: String, @Body products: Products): Call<String>

    @DELETE("product/{id}")
    suspend fun deleteproduct(@Path("id") id: String): Response<String>
}

object HotelApi {
    val retrofitservice: HotelApiService by lazy {
        retrofit.create(HotelApiService::class.java)
    }
}