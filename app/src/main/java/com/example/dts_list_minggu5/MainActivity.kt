package com.example.dts_list_minggu5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: Adapter

    private var list = mutableListOf<Array<String>>(
        arrayOf("Indonesia", "Ibukota : Jakarta", "Luas Negara: 5.193.250 km² Ibu Kota: Jakarta Kepala Negara: Presiden Kepala Pemerintah: Presiden Mata Uang Negara-negara ASEAN: Rupiah\n" +
            "\n" +
            "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap.\n" +
            "\n" +
            "\n" +
            "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
            "https://www.inews.id/apps"),
        arrayOf("Vietnam", "Ibukota : Hanoi", "Luas Negara: 331.690 km² Ibu Kota: Hanoi Kepala Negara: Presiden (Ketua Dewan Negara)  Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Dong\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap/2.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Malaysia", "Ibukota : Kuala Lumpur", "Luas Negara: 329.758 km² Ibu Kota: Kuala Lumpur Kepala Negara: Yang Dipertuan Agung Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Ringgit\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Singapura", "Ibukota : Singapura", "Luas Negara: 685 km² Ibu Kota: Singapura Kepala Negara: Presiden Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Dolar Singapura\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Filiphina", "Ibukota : Manila", "Luas Negara: 300.000 km² Ibu Kota: Manila Kepala Negara: Presiden Kepala Pemerintah: Presiden  Mata Uang Negara-negara ASEAN: Peso\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Thailand", "Ibukota : Bangkok", "Luas Negara: 514.000 km² Ibu Kota: Bangkok Kepala Negara: Raja Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Baht\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Brunei Darussalam", "Ibukota : Bandar Seri Begawan", "Luas Negara: 5.765 km² Ibu Kota: Bandar Seri Begawan Kepala Negara: Sultan Kepala Pemerintah: Sultan Mata Uang Negara-negara ASEAN: Dolar Brunei\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap/2.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Kamboja", "Ibukota : Phnom Penh", "Luas Negara: 181.035 km² Ibu Kota: Phnom Penh Kepala Negara: Raja Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Riel\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap/2.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Myanmar", "Ibukota : Yangon", "Luas Negara: 676.552 km² Ibu Kota: Yangon (Rangoon) Kepala Negara: Presiden Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Kyat\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap/2.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"),
        arrayOf("Laos", "Ibukota : Vientiane", "Luas Negara: 236.800 km² Ibu Kota: Vientiane Kepala Negara: Presiden Kepala Pemerintah: Perdana Menteri Mata Uang Negara-negara ASEAN: Kip\n" +
                "\n" +
                "Artikel ini telah tayang di www.inews.id dengan judul \" 10 Negara-negara ASEAN Beserta Profil dan Ibu Kotanya Lengkap \", Klik untuk baca: https://www.inews.id/news/nasional/10-negara-negara-asean-beserta-profil-dan-ibu-kotanya-lengkap/2.\n" +
                "\n" +
                "\n" +
                "Download aplikasi Inews.id untuk akses berita lebih mudah dan cepat:\n" +
                "https://www.inews.id/apps"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerAdapter = Adapter(list.toTypedArray())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerAdapter
    }
}