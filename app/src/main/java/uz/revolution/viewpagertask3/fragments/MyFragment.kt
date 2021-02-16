package uz.revolution.viewpagertask3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.view.*
import uz.revolution.viewpagertask3.R
import uz.revolution.viewpagertask3.models.MyModel


private const val ARG_PARAM1 = "param1"

class MyFragment : Fragment() {

    private var param1: MyModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getSerializable(ARG_PARAM1) as MyModel?
        }
    }

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_my, container, false)

        root.image_view.setImageResource(param1!!.image)
        root.sarlavha.text=param1!!.sarlavha
        root.matn.text=param1!!.matn

        return root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: MyModel) =
            MyFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}