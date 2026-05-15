# alstrudat-c01-ifs24047

## Description

Sebuah rumah sakit membutuhkan sistem untuk mengatur urutan pelayanan pasien di Instalasi Gawat Darurat (IGD) secara otomatis. Sistem ini harus mampu menentukan siapa yang harus dilayani lebih dulu berdasarkan tingkat keparahan kondisi medis, usia, dan waktu kedatangan pasien.

Setiap pasien yang datang akan didaftarkan dengan 4 data utama:
1. Nama: Nama lengkap pasien.
2. Umur: Usia pasien saat ini.
3. Kategori: Keterangan kategori kondisi (Ringan Sedang, Berat, Menular).
4. Tingkat Urgensi: Skor angka 1-10.
catatan: kika seorang pasien memiliki Tingkat Urgensi 10, sistem akan mengeluarkan peringatan virus menular dan  berhenti menerima input pasien berikutnya, meskipun jumlah n belum tercapai.

A. Kategori dan Tingkat Urgensi
| No | Kategori | Tingkat Urgensi |
|----|----------|-----------------|
| 1  | Ringan   | 1-3             |
| 2  | Sedang   | 4-6             |
| 3  | Berat    | 7-9             |
| 4  | Menular  | 10              |

B. Aturan Prioritas

Urutan pelayanan diatur dengan hirarki sebagai berikut:

1. Pasien dengan Tingkat Urgensi tertinggi dilayani lebih dulu.

2. Jika urgensi sama, pasien dengan Umur lebih tua didahulukan.

3. Jika urgensi dan umur sama, pasien yang datang lebih awal dilayani lebih dulu.

## Source Codes

| No | File         | Deskripsi         |
|----|--------------|-------------------|
| 1  | App.java     | Bawaan            |
| 2  | Program.java | Melengkapi Fungsi |

## Test Cases
| No | Input                                                                                                                                                                                                                                                                                                                                                                                      | Output                                                                                               |
|----|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| 1  | Masukkan jumlah pasien: 2<br>Pasien ke-1:<br>Nama: Joyce<br>Umur: 20<br>Kategori: Menular<br>Tingkat Urgensi: 10<br>                                                                                                                                                                                                                                                                       | PASIEN JOYCE TERDETEKSI VIRUS MENULAR!<br><br>--- Urutan Pelayanan IGD ---<br>Pasien urutan 1: Joyce |
| 2  | Masukkan jumlah pasien: 4<br><br>Pasien ke-1:<br>Nama: Joyce<br>Umur: 20<br>Kategori: Ringan<br>Tingkat Urgensi: 2<br><br>Pasien ke-2:<br>Nama: Martha<br>Umur: 70<br>Kategori: Berat<br>Tingkat Urgensi: 8<br><br>Pasien ke-3:<br>Nama: Dian<br>Umur: 25<br>Kategori: Sedang<br>Tingkat Urgensi: 5<br><br>Pasien ke-3:<br>Nama: Dimas<br>Umur: 5<br>Kategori: berat<br>Tingkat Urgensi: 8 | Pasien urutan 1: Martha<br>Pasien urutan 2: Dimas<br>Pasien urutan 3: Dian<br>Pasien urutan 4: Joyce |
| 3  | Masukkan jumlah pasien: 3<br><br>Pasien ke-1:<br>Nama: Ian<br>Umur: 23<br>Kategori: Sedang<br>Tingkat Urgensi: 1<br><br>Pasien ke-2:<br>Nama: Rivaldi<br>Umur: 40<br>Kategori: Ringan<br>Tingkat Urgensi: 8<br><br>Pasien ke-3:<br>Nama: Dimas<br>Umur: 5<br>Kategori: Berat<br>Tingkat Urgensi: 8                                                                                         | Pasien urutan 1: Rivaldi<br>Pasien urutan 2: Dimas<br>Pasien urutan 3: Ian                           |


## Compile

`mvn clean package`

## Run

`java -cp target/app.jar del.alstrudat.App`
