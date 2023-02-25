package com.example.testrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecycleView;
    private LinkedList<Paper> mWordList =  new LinkedList<Paper>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordList.add(new Paper("Tiêu đề 1","Tổng thống Thổ Nhĩ Kỳ Tayyip Erdogan cảm ơn các chiến sĩ Việt Nam", R.drawable.img));
        mWordList.add(new Paper("Tiêu đề 2","Cái nắm tay ấm lòng giữa giá rét của các sĩ quan Quân đội Việt Nam tại Thổ Nhĩ Kỳ", R.drawable.img_1));
        mWordList.add(new Paper("Tiêu đề 3","Điều chưa từng có tiền lệ khi Quân đội Việt Nam cứu hộ, cứu nạn tại Thổ Nhĩ Kỳ", R.drawable.img_2));
        mWordList.add(new Paper("Tiêu đề 4","Thứ trưởng Quốc phòng ra tận chân máy bay đón 76 sĩ quan trở về từ Thổ Nhĩ Kỳ", R.drawable.img_3));
        mWordList.add(new Paper("Tiêu đề 5","Người phụ nữ nhận lại điện thoại đắt tiền sau hơn 2 giờ bị móc túi", R.drawable.img_4));
        mWordList.add(new Paper("Tiêu đề 6","Hàng loạt mặt bằng trung tâm Hà Nội rao vặt tìm khách thuê", R.drawable.img_5));
        mWordList.add(new Paper("Tiêu đề 7","Thanh niên lĩnh 14 năm tù sau màn trả đũa khi người yêu bị chọc ghẹo", R.drawable.img_6));
        mWordList.add(new Paper("Tiêu đề 8","Khởi tố người cha dùng dao chém con trai tử vong", R.drawable.img_7));
        mWordList.add(new Paper("Tiêu đề 9","Xét xử người đàn ông tưới xăng thiêu chết nhân tình ở Hà Nội", R.drawable.img_8));
        mWordList.add(new Paper("Tiêu đề 10","Tạm giữ thêm nghi phạm vụ người phụ nữ bị giết tại cây xăng bỏ hoang\n", R.drawable.img_9));


        mRecycleView = findViewById(R.id.recycleView);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(new WordListAdapter(getApplicationContext(),mWordList));


    }
}