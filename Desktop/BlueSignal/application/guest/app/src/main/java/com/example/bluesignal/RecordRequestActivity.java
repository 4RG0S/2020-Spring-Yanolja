package com.example.bluesignal;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RecordRequestActivity extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL="http://seatrea.dothome.co.kr/record_input.php";
    private Map<String,String> map;

    public RecordRequestActivity(String guest_id, String host_id, String time1, String date1, String guest_status, String host_status, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);//위 url에 post방식으로 값을 전송

        map=new HashMap<>();
        map.put("guest_id",guest_id);
        map.put("host_id",host_id);
        map.put("time1", time1);
        map.put("date1",date1);
        map.put("guest_status",guest_status);
        map.put("host_status",host_status);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}