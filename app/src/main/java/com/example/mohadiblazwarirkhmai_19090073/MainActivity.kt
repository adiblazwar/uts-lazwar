package com.example.mohadiblazwarirkhmai_19090073


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.demokrat,"Demokrat","Demokrat","Visi : Menjadi Institusi yang profesional, antisipatif dan responsif dalam mendukung serta memfasilitasi kinerja dan hasil kerja DPRD\n" +
                "Misi :Mewujudkan Peningkatan Pelayanan Internal,Mewujudkan Peningkatan Pelayanan Eksternal,Menjadi sumber informasi kegiatan DPRD dan studi bidang Politik "
                 ))

        data?.add(DataModel(R.drawable.gerindra,"Gerindra","Gerindra", "Untuk diketahui, media sosial diramaikan oleh logo Partai Gerindra diedit seseorang hingga gambar kepala garuda diganti menjadi lobster. Di bawah gambar lobster itu, terdapat tulisan 'Gerindra, Gerakan Indonesia Raya', persis seperti yang tertulis di logo partai yang asli."+

         "Kami santai aja, anggap itu lucu-lucuan dari orang yang merasa terganggu dengan kebesaran Gerindra saat ini, kata juru bicara Gerindra, Habiburokhman, saat dimintai tanggapan"
            ))

        data?.add(DataModel(R.drawable.golkar,"Golkar","Golkar", "Golongan Karya (Golkar) muncul dari kolaborasi gagasan tiga tokoh, Soekarno, Soepomo, dan Ki Hadjar Dewantara. Ketiganya, mengajukan gagasan integralistik-kolektivitis sejak 1940. Saat itu, gagasan tiga tokoh ini mewujud dengan adanya Golongan Fungsional. Dari nama ini, kemudian diubah dalam bahasa Sansekerta sehingga menjadi Golongan Karya pada 1959. Hingga kini, Golongan Karya dikenal dalam dunia politik nasional sebagai Golkar"))

        data?.add(DataModel(R.drawable.nasdem,"Nasdem","Nasdem", "Kita membangun Partai NasDem bukan untuk menjadikannya sebuah perusahaan dalam logika industrialis. Partai adalah instrument pergerakan; di sini tak boleh ada semangat transaksional, tak boleh ada yang berpikir untuk mencari selisih atau berdagang. NasDem adalah partai yang menjadi sikap ideologis dan dikelola secara profesional."
        ))

        data?.add(DataModel(R.drawable.pdi,"PDI","PDI Perjuangan", "Partai Demokrasi Indonesia Perjuangan (PDIP) mempunyai cara tersendiri dalam mencalonkan kepala daerah yang akan bertarung pada pemilihan kepala daerah (pilkada). Tengok saja pilkada Jawa Tengah (Jateng). Bukannya mengusung incumbent Wakil Gubernur (Wagub) Jateng, Rustriningsih, tokoh yang dianggap dapat menyaingi Gubernur incumbent, Bibit Waluyo, PDIP malah menyodorkan Ganjar Pranowo."
        ))

        data?.add(DataModel(R.drawable.pks,"PKS","PKS", "Sekadar diketahui, logo baru PKS diluncurkan dalam gelaran Munas V PKS di Bandung, Minggu 29 November 2020. Sedangkan Partai Ummat meluncurkan logonya, yakni Perisai Tauhid , pada Selasa 10 November 2020 di akun resmi YouTube Amien Rais Official"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("deskripsi", item?.deskripsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}