package mumtaz.abera.navigationcomponentsafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mumtaz.abera.navigationcomponentsafeargs.databinding.FragmentKetigaBinding


class FragmentKetiga : Fragment() {

    private var _binding : FragmentKetigaBinding?= null
    private val binding get() =  _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKetigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = FragmentKetigaArgs.fromBundle(arguments as Bundle).name

        binding.tvName.text = "Namanya : $aName"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}