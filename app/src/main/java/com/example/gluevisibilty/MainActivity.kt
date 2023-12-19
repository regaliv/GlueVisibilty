package com.example.gluevisibilty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gluevisibilty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*private var a:Double = 0.0
    private var b:Double = 0.0
    private var c:Double = 0.0
    private var d:Double = 0.0
    private var e:Double = 0.0
    private var f:Double = 0.0*/


    /*private var aa: Double = 0.0
    private var bb: Double = 0.0
    private var cc: Double = 0.0
    private var dd: Double = 0.0
    private var ee: Double = 0.0
    private var ff: Double = 0.0*/


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /*aa= list[0].toDouble()
        bb= list[1].toDouble()
        cc= list[2].toDouble()
        dd= list[3].toDouble()
        ee= list[4].toDouble()
        ff= list[5].toDouble()*/




        binding.button.setOnClickListener {


            if (!isFieldEmpty()) {
                binding.CL1.visibility = View.GONE
                binding.Cl2.visibility = View.VISIBLE
            }
        }
        binding.imageButton.setOnClickListener {
            binding.Cl2.visibility = View.GONE
            binding.CL1.visibility = View.VISIBLE
        }


        binding.button2.setOnClickListener {


            if (!isFieldEmpty2()) {
                getResult()
                binding.CL3.visibility = View.VISIBLE
                binding.Cl2.visibility = View.GONE
            }
        }

        binding.imageButton2.setOnClickListener {
            binding.CL3.visibility = View.GONE
            binding.Cl2.visibility = View.VISIBLE
        }

    }

    private fun getResult(): String {


        val a: Double
        val b: Double
        val c: Double
        val e: Double
        val f: Double
        val d: Double

        val aa: Double
        val bb: Double
        val cc: Double
        val ee: Double
        val ff: Double
        val dd: Double

        val aaa: Double
        val bbb: Double
        val ccc: Double
        val ddd: Double
        val eee: Double
        val fff: Double


        val const: Double = 1/(0.75*0.40)

        binding.apply {
            a = edA.text.toString().toDouble()
            b = edB.text.toString().toDouble()
            c = edC.text.toString().toDouble()
            d = edD.text.toString().toDouble()
            e = edE.text.toString().toDouble()
            f = edF.text.toString().toDouble()

            aa = edA2.text.toString().toDouble()
            bb = edB2.text.toString().toDouble()
            cc = edC2.text.toString().toDouble()
            dd = edD2.text.toString().toDouble()
            ee = edE2.text.toString().toDouble()
            ff = edF2.text.toString().toDouble()

            aaa = (aa - a) * const
            bbb = (bb - b) * const
            ccc = (cc - c) * const
            ddd = (dd - d) * const
            eee = (ee - e) * const
            fff = (ff - f) * const


            binding.textView111.text = aaa.toString()
            binding.textView222.text = bbb.toString()
            binding.textView333.text = ccc.toString()
            binding.textView444.text = ddd.toString()
            binding.textView555.text = eee.toString()
            binding.textView777.text = fff.toString()


        }

        return aaa.toString()
    }


    private fun isFieldEmpty(): Boolean {
        binding.apply {// apply даёт возможность прикрепить к binding несколько активностей
            if (edA.text.isNullOrEmpty()) edA.error = getString(R.string.no_value_entered)
            if (edB.text.isNullOrEmpty()) edB.error = getString(R.string.no_value_entered)
            if (edC.text.isNullOrEmpty()) edC.error = getString(R.string.no_value_entered)
            if (edD.text.isNullOrEmpty()) edD.error = getString(R.string.no_value_entered)
            if (edE.text.isNullOrEmpty()) edE.error = getString(R.string.no_value_entered)
            if (edF.text.isNullOrEmpty()) edF.error = getString(R.string.no_value_entered)


            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty() || edC.text.isNullOrEmpty()
                    || edD.text.isNullOrEmpty() || edE.text.isNullOrEmpty() || edF.text.isNullOrEmpty()
        }

    }

    private fun isFieldEmpty2(): Boolean {
        binding.apply {// apply даёт возможность прикрепить к binding несколько активностей
            if (edA2.text.isNullOrEmpty()) edA2.error = getString(R.string.no_value_entered)
            if (edB2.text.isNullOrEmpty()) edB2.error = getString(R.string.no_value_entered)
            if (edC2.text.isNullOrEmpty()) edC2.error = getString(R.string.no_value_entered)
            if (edD2.text.isNullOrEmpty()) edD2.error = getString(R.string.no_value_entered)
            if (edE2.text.isNullOrEmpty()) edE2.error = getString(R.string.no_value_entered)
            if (edF2.text.isNullOrEmpty()) edF2.error = getString(R.string.no_value_entered)


            return edA2.text.isNullOrEmpty() || edB2.text.isNullOrEmpty() || edC2.text.isNullOrEmpty()
                    || edD2.text.isNullOrEmpty() || edE2.text.isNullOrEmpty() || edF2.text.isNullOrEmpty()
        }

    }
}