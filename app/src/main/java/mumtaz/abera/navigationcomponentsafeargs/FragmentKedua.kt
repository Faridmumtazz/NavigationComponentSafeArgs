package mumtaz.abera.navigationcomponentsafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import mumtaz.abera.navigationcomponentsafeargs.databinding.FragmentKeduaBinding


class FragmentKedua : Fragment() {

    private var _binding: FragmentKeduaBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKeduaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = arguments?.getString(FragmentPertama.EXTRA_NAME)
        binding.tvNama.text = "Nama Kamu : $aName"

        binding.btnToFragmentKetiga.setOnClickListener{view ->
            if (binding.etName.text.isNullOrEmpty()){
                Toast.makeText(requireContext(), "Kolom Nama Masih Kosong", Toast.LENGTH_SHORT).show()
            }else{
                val actionToFragmentKetiga = FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga()
                actionToFragmentKetiga.name = binding.etName.text.toString()
                view.findNavController().navigate(actionToFragmentKetiga)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}