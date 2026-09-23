# Minpro-2-PBO-PeminjamanAlatLab
## Deskripsi Singkat Program
<p>PeminjamanAlatLab adalah program sistem sederhana berbasis Java untuk mengelola peminjaman alat pada laboratorium biologi. Program ini menyediakan fitur untuk menambah peminjaman, menampilkan riwayat peminjaman, dan mengembalikan alat melalui menunya.</p>

## Penjelasan Alur Program
Saat program pertama kali di run, sistem akan memberikan output menu utama yang terdiri dari empat pilihan:
1. Tampilkan Alat
2. Tambah Peminjaman
3. Tampilkan Riwayat Peminjaman
4. Kembalikan Alat
5. Hapus Peminjaman
6. Keluar

<p align="center">
<img src="https://github.com/user-attachments/assets/dde8a723-cf14-4036-84ba-b9880c4c6f63" width=60% />
</p>

<br>

<p>Petugas dapat melihat daftar alat yang tersedia di laboratorium melalui pilihan menu 1. Alat yang ditampilkan dikelompokkan berdasarkan kategorinya, yaitu alat lab, alat bedah, dan alat ukur. Setelah daftar alat ditampilkan, program akan otomatis kembali ke menu utama.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/dc64c52a-9887-42d8-b92a-a375e3b04d3a" width=60%/>
</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/4c9fe8fe-4093-4878-9cfc-7a5c7891b5aa" width=60%/>
</p>

<br>

<p>Saat petugas ingin meminjam alat, mereka dapat memilih menu 2. Mereka lalu harus mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data tersebut berhasil di input, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan” beserta sisa stok alatnya, lalu balik ke menu awal.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/88331399-85e6-40a4-9a59-47999647c85c" width=60%/>
</p>

<br>

<p>Setiap peminjaman alat akan memengaruhi stok. Dapat dilihat sebagai contoh, setelah petugas meminjam 2 forceps, stoknya berubah dari 3 menjadi 2.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/e9be7b61-bf81-4a21-b4fc-d35ec2dbd03d" width=60%/>
</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/83577564-8d8a-4ad9-97d4-797388d84c45" width=60%/>
</p>

<br>

<p>Program ini juga memiliki pembatasan dalam proses peminjaman alat. Jika petugas memasukkan jumlah peminjaman yang melebihi stok yang tersedia, sistem akan menampilkan peringatan bahwa stok alat tidak mencukupi dan menunjukkan jumlah stok yang tersedia. Selain itu juga, jika petugas mencoba meminjam alat yang tidak ada dalam daftar alat pada menu 1, sistem akan menampilkan pemberitahuan bahwa alat tersebut tidak tersedia.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/1be58127-7c3b-41ad-8ea8-950c0007aeaa" width=60%/>
</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/64d1e1e6-da04-4699-81c7-8ba7979095df" width=60%/>
</p>

<br>

<p>Petugas dapat melihat riwayat peminjaman alat di laboratorium pada menu 3. Menu ini akan menampilkan ID peminjaman, nama petugas, nama alat, dan jumlah alat yang telah dipinjam, serta status "Dipinjam" yang secara otomatis diberikan oleh sistem. Setelah menampilkan riwayat, program akan balik ke menu awal.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/96c49ccf-1be3-4e88-8d58-efd514bb9f6d" width=60%/>
</p>

<br>

<p>Setelah mengembalikan alat yang dipinjam, petugas dapat memilih menu 4 untuk mencatat pengembaliannya. Setelah memasukkan ID peminjaman, sistem akan mencatat bahwa alat telah dikembalikan, dan balik ke menu awal.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/93a28d7d-af8a-4219-adfa-761d7f86e1b5" width=60%/>
</p>

<br>

<p>Usai melakukan pengembalian, status peminjaman alat dapat dilihat kembali melalui menu riwayat, dengan status yang otomatis diperbarui menjadi “Dikembalikan”.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/89b3a58e-46d7-4456-a6fe-ce70d3adad37" width=60%/>
</p>

<br>

<p>Pada menu 5, riwayat peminjaman yang sudah lama dapat dihapus agar data yang tersimpan dalam program tidak terlalu banyak. Penghapusan dilakukan dengan memasukkan ID peminjaman, kemudian sistem akan menghapus data tersebut secara otomatis. Data yang telah dihapus juga tidak akan ditampilkan lagi pada menu riwayat.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/1b0f665b-3b45-4577-9ea7-758e2a738b00" width=60%/>
</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/fcecaf42-4d0c-4aad-ac65-26dc8c8390f3" width=60%/>
</p>

<br>

<p>Jika petugas ingin keluar dari program, mereka dapat memilih menu 6, dan pengulangan menu akan berhenti.</p>

<p align="center">
<img src="https://github.com/user-attachments/assets/87c2c392-3a0d-468e-a0b0-15d802f2f7d5" width=60%/>
</p>

## Penerapan Encapsulation dan Inheritance
### Encapsulation (Enkapsulasi) 
<p>Enkapsulasi diterapkan pada java class pada package model, menggunakan access modifier protected pada atribut di class untuk membatasi akses langsung terhadap data dari luar class. Data tersebut kemudian hanya dapat diakses melalui method getter dan setter.</p>

<p align="center">
  <i>Penerapan access modifier protected pada atribut</i><br>
  <img src="https://github.com/user-attachments/assets/d204f52c-5630-4631-8450-5b7c15508f0f" width=60%/>
</p>

<p align="center">
  <i>Penerapan getter dan setter</i><br>
  <img src="https://github.com/user-attachments/assets/7144f5c6-0407-4dfd-be8c-7bcf13120574" width=60%/>
</p>

### Inheritance
<p>Inheritance diimplementasikan pada java class *AlatLab* sebagai induk/superclass, dengan *AlatBedah* dan *AlatUkur* sebagai subclass yang mewarisi atribut dan method dari *AlatLab*.</p>

<p align="center">
  <i>Class AlatLab (Superclass)</i>
  <img src="https://github.com/user-attachments/assets/2e7061a6-c56a-41e3-8227-61a76a37098d" width=60%/>
</p>

<p align="center">
<i>Class AlatBedah (Subclass)</i>
  <img src="https://github.com/user-attachments/assets/d19e7c6c-5d84-4c47-bd42-68100750e371" width=60%/>
</p>

<p align="center">
  <i>Class AlatUkur</i>
  <img src="https://github.com/user-attachments/assets/fb03a61c-579b-498a-838a-ecdc04d90677" width=60%/>
</p>

## Penerapan nilai tambah
### Polymorphism (Method Overriding)
<p>Method overriding diimplementasikan pada class *AlatBedah* dan *AlatUkur* dengan mengubah implementasi method *tampilkanInfo()* yang berasal dari class *AlatLab*.</p>

<p align="center">
  <i>Class AlatLab</i><br>
  <img src="https://github.com/user-attachments/assets/5cf959be-66d4-48a0-9b1c-5f7297c97fd6" width=60%/>
</p>

<p align="center">
  <i>Class AlatBedah</i><br>
  <img src="https://github.com/user-attachments/assets/0b805125-4228-48c2-8b4a-af9448076709" width=60%/>
</p>

<p align="center">
  <i>Class AlatUkur</i><br>
  <img src="https://github.com/user-attachments/assets/957c2def-9942-40bb-958a-01a754cfe8a6" width=60%/>
</p>
