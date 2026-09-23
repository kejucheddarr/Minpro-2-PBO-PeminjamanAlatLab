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

<div align=center> <img src="https://github.com/user-attachments/assets/dde8a723-cf14-4036-84ba-b9880c4c6f63" width=55% /> </div>

<br/>

<p>Petugas dapat melihat daftar alat yang tersedia di laboratorium melalui pilihan menu 1. Alat yang ditampilkan dikelompokkan berdasarkan kategorinya, yaitu alat lab, alat bedah, dan alat ukur. Setelah daftar alat ditampilkan, program akan otomatis kembali ke menu utama.</p>

<div align=center> <img src="https://github.com/user-attachments/assets/dc64c52a-9887-42d8-b92a-a375e3b04d3a" width=45%/> <img src="https://github.com/user-attachments/assets/4c9fe8fe-4093-4878-9cfc-7a5c7891b5aa" width=45%/> </div>

<br/>

<p>Saat petugas ingin meminjam alat, mereka dapat memilih menu 2. Mereka lalu harus mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data tersebut berhasil di input, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan” beserta sisa stok alatnya, lalu balik ke menu awal.</p>

<div align=center><img src="https://github.com/user-attachments/assets/88331399-85e6-40a4-9a59-47999647c85c" width=50%/></div>

<br/>

<p>Setiap peminjaman alat akan memengaruhi stok. Dapat dilihat sebagai contoh, setelah petugas meminjam 2 forceps, stoknya berubah dari 3 menjadi 2.</p>

<div align=center><img src="https://github.com/user-attachments/assets/e9be7b61-bf81-4a21-b4fc-d35ec2dbd03d" width=45%/> <img src="https://github.com/user-attachments/assets/83577564-8d8a-4ad9-97d4-797388d84c45" WDITH=45%/></div>

<br/>

<p>Program ini juga memiliki pembatasan dalam proses peminjaman alat. Jika petugas memasukkan jumlah peminjaman yang melebihi stok yang tersedia, sistem akan menampilkan peringatan bahwa stok alat tidak mencukupi dan menunjukkan jumlah stok yang tersedia. Selain itu juga, jika petugas mencoba meminjam alat yang tidak ada dalam daftar alat pada menu 1, sistem akan menampilkan pemberitahuan bahwa alat tersebut tidak tersedia.</p>

<div align=center> <img src="https://github.com/user-attachments/assets/1be58127-7c3b-41ad-8ea8-950c0007aeaa" width=45%/> <img src="https://github.com/user-attachments/assets/64d1e1e6-da04-4699-81c7-8ba7979095df" width=45%/> </div>

<br/>

<p>Petugas dapat melihat riwayat peminjaman alat di laboratorium pada menu 3. Menu ini akan menampilkan ID peminjaman, nama petugas, nama alat, dan jumlah alat yang telah dipinjam, serta status "Dipinjam" yang secara otomatis diberikan oleh sistem. Setelah menampilkan riwayat, program akan balik ke menu awal.</p>

<div align=center><img src="https://github.com/user-attachments/assets/96c49ccf-1be3-4e88-8d58-efd514bb9f6d" width=50%/></div>

<br/>

<p>Setelah mengembalikan alat yang dipinjam, petugas dapat memilih menu 4 untuk mencatat pengembaliannya. Setelah memasukkan ID peminjaman, sistem akan mencatat bahwa alat telah dikembalikan, dan balik ke menu awal.</p>

<div align=center><img src="https://github.com/user-attachments/assets/93a28d7d-af8a-4219-adfa-761d7f86e1b5" wdith=50%/></div>

<br/>

<p>Usai melakukan pengembalian, status peminjaman alat dapat dilihat kembali melalui menu riwayat, dengan status yang otomatis diperbarui menjadi “Dikembalikan”.</p>

<div align=center><img src="https://github.com/user-attachments/assets/89b3a58e-46d7-4456-a6fe-ce70d3adad37" width=50%/></div>

<br/>

<p>Pada menu 5, riwayat peminjaman yang sudah lama dapat dihapus agar data yang tersimpan dalam program tidak terlalu banyak. Penghapusan dilakukan dengan memasukkan ID peminjaman, kemudian sistem akan menghapus data tersebut secara otomatis. Data yang telah dihapus juga tidak akan ditampilkan lagi pada menu riwayat.</p>

<div align=center><img src="https://github.com/user-attachments/assets/1b0f665b-3b45-4577-9ea7-758e2a738b00" width=45%/><img src="https://github.com/user-attachments/assets/fcecaf42-4d0c-4aad-ac65-26dc8c8390f3" width=45%/></div>

<br/>

<p>Jika petugas ingin keluar dari program, mereka dapat memilih menu 6, dan pengulangan menu akan berhenti.</p>

<div align=center><img src="https://github.com/user-attachments/assets/87c2c392-3a0d-468e-a0b0-15d802f2f7d5" wdith=50%/></div>

## Penerapan Encapsulation dan Inheritance
### Encapsulation (Enkapsulasi) 
Enkapsulasi diterapkan dengan menggunakan access modifier protected pada atribut di class untuk membatasi akses langsung terhadap data dari luar class. Data tersebut kemudian hanya dapat diakses melalui method getter dan setter.

### Inheritance

## Penerapan nilai tambah
### Polymorphism (Method Overriding)
method overriding di implementasikan pada alatukur dan alat bedah
<img width="684" height="160" alt="image" src="https://github.com/user-attachments/assets/cc180bc0-a307-4ba0-9713-0a692f6785bd" />

<img width="719" height="191" alt="image" src="https://github.com/user-attachments/assets/cf040e8c-9655-41c5-a23f-3d1cdc8376c8" />
