# Implementasi Polimorfisme – Studi Kasus Perangkat Keras

## 📘 Deskripsi Proyek
Proyek ini dibuat untuk memenuhi tugas **Konsentrasi Keahlian Rekayasa Perangkat Lunak** pada mata pelajaran *Pemrograman Berbasis Teks, Grafis, dan Multimedia*.  
Tujuan proyek ini adalah untuk mengimplementasikan konsep **Polimorfisme** dalam pemrograman berorientasi objek menggunakan **Java**, dengan studi kasus bertema **Perangkat Keras**.

## 👥 Anggota Kelompok
- Ghifar Maulana Ristyono (13)
- Ilham Rangga Kurniawan  (15)
- Danish Dhiahurrahman    (8)

## 🧩 Konsep yang Diterapkan
Proyek ini menampilkan penerapan enam konsep utama:
1. **Polimorfisme**
2. **Virtual Method Invocation (VMI)**
3. **Heterogeneous Collection**
4. **Polymorphic Argument**
5. **Instanceof**
6. **Object Casting**

## 🏗️ Struktur Program
Program terdiri dari:
- **Superclass**: `PerangkatKeras`
- **Subclass**:  
  - `GPU`
  - `RAM`
  - `SSD`
  - `MOTHERBOARD`

## 📄 Diagram UML


## ⚙️ Konsep Polimorfisme

### 🔹 Polimorfisme
Polimorfisme berasal dari istilah biologi yang berarti *banyak bentuk*.  
Dalam pemrograman berorientasi objek (OOP), **polimorfisme adalah kemampuan suatu objek untuk memiliki berbagai bentuk atau perilaku yang berbeda**.  
Artinya, satu referensi dari superclass dapat digunakan untuk mewakili objek dari berbagai subclass yang memiliki hubungan **inheritance**.  
Polimorfisme hanya bisa diterapkan pada kelas yang saling berhubungan melalui pewarisan.

---

### 🔹 Virtual Method Invocation (VMI)
**Virtual Method Invocation** terjadi ketika method yang telah dioverride di subclass dipanggil melalui referensi superclass.  
Meskipun objek tersebut dideklarasikan sebagai superclass, method yang dijalankan adalah milik subclass yang sebenarnya.  
Hal ini menunjukkan bagaimana Java menentukan method yang dijalankan berdasarkan tipe objek sesungguhnya pada saat program berjalan.

---

### 🔹 Heterogeneous Collection
**Heterogeneous Collection** adalah kumpulan objek yang bertipe superclass, namun dapat berisi berbagai objek dari subclass yang berbeda.  
Konsep ini memungkinkan penyimpanan beberapa jenis objek dalam satu struktur data yang sama, seperti array atau list, sehingga lebih fleksibel dan efisien dalam pengelolaan data.

---

### 🔹 Polymorphic Argument
**Polymorphic Argument** merupakan penerapan polimorfisme pada parameter method.  
Sebuah method yang memiliki parameter bertipe superclass dapat menerima argumen berupa objek dari subclass apa pun yang masih memiliki hubungan pewarisan dengan superclass tersebut.  
Dengan cara ini, satu method dapat bekerja untuk berbagai jenis objek tanpa perlu dibuat ulang.

---

### 🔹 Operator instanceof
**Instanceof** adalah operator yang digunakan untuk memeriksa apakah suatu objek merupakan hasil instansiasi dari kelas tertentu.  
Operator ini menghasilkan nilai `true` atau `false` dan digunakan untuk memastikan tipe objek sebelum dilakukan operasi tertentu, seperti *casting*.

---

### 🔹 Object Casting
**Object Casting** adalah proses mengubah tipe suatu objek dari satu kelas ke kelas lain dalam hierarki inheritance.  
Proses ini digunakan agar atribut atau method khusus subclass dapat diakses dari objek yang sebelumnya direferensikan sebagai superclass.  
Biasanya dilakukan setelah pemeriksaan tipe objek dengan `instanceof` untuk menghindari error.

---
