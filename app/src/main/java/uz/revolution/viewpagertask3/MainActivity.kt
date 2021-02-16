package uz.revolution.viewpagertask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.viewpagertask3.adapters.MyAdapter
import uz.revolution.viewpagertask3.models.MyModel


class MainActivity : AppCompatActivity() {

    lateinit var data: ArrayList<MyModel>
    lateinit var adapter:MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        data = ArrayList()
        data.add(
            MyModel(
                "Click va Paymega o’tish xizmati",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.group1
            )
        )
        data.add(
            MyModel(
                "Barcha operatorlar bo’yicha statistika",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.group2
            )
        )
        data.add(
            MyModel(
                "Tariflarni filtrlash",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.group3
            )
        )
        data.add(
            MyModel(
                "Yangi imkoniyatlar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Pulvinar aliquam at donec facilisis. Lacus, justo, volutpat, diam condimentum ipsum, faucibus rutrum.",
                R.drawable.group4
            )
        )

        adapter = MyAdapter(data, supportFragmentManager)
        view_pager.adapter = adapter
        tab_layout.setupWithViewPager(view_pager)

        next.setOnClickListener {
            view_pager.setCurrentItem(getItem(+1),true)
        }

        next_btn.setOnClickListener {
            view_pager.setCurrentItem(getItem(+1),true)
        }

        skip.setOnClickListener {
            view_pager.setCurrentItem(4, true)
        }
    }

    private fun getItem(i:Int):Int{
        return view_pager.currentItem+i
    }
}