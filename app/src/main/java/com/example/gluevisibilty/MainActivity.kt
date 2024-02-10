package com.example.gluevisibilty

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.gluevisibilty.databinding.ActivityMainBinding
import java.lang.String.format

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
    @SuppressLint("DefaultLocale")
    private fun getResult() {

       val a: Double
        val b: Double
        val c: Double
        val d: Double
        val e: Double
        val f: Double

        val aa: Double
        val bb: Double
        val cc: Double
        val dd: Double
        val ee: Double
        val ff: Double


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

            val aaaa =  format("%.2f", aaa)
            val bbbb =  format("%.2f", bbb)
            val cccc =  format("%.2f", ccc)
            val dddd =  format("%.2f", ddd)
            val eeee =  format("%.2f", eee)
            val ffff =  format("%.2f", fff)


            binding.textView111.text = aaaa.toString()
            binding.textView222.text = bbbb.toString()
            binding.textView333.text = cccc.toString()
            binding.textView444.text = dddd.toString()
            binding.textView555.text = eeee.toString()
            binding.textView777.text = ffff.toString()

        }

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