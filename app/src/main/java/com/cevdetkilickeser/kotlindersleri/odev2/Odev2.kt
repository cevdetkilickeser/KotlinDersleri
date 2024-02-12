package com.cevdetkilickeser.kotlindersleri.odev2

class Odev2 {

    fun icAciHesapla(kenarSayisi:Int) : Int {
        val icAci = (kenarSayisi - 2) * 180 / kenarSayisi
        return icAci
    }

    fun maasHesapla(calisilanGun:Int) : Int {
        var maas = 0
        val calisilanSaat = calisilanGun * 8
        if (calisilanSaat  <= 150){
            maas = calisilanSaat * 40
        }else{
            maas = 150 * 40 + (calisilanSaat - 150) * 80
        }
        return maas
    }

    fun otoparkUcretHesapla(sure:Int) : Int{
        var ucret = 50
        if (sure > 1){
            ucret = 50 + (sure - 1) * 10
        }
        return ucret
    }

    fun mileCevir(km:Double) : Double{
        val mil = km *  0.621
        return mil
    }

    fun alanHesapla(k1:Double, k2:Double){
        val alan = k1 * k2
        println(alan)
    }

    fun faktoriyelHesapla(sayi:Int) : Int {
        var num = sayi
        var faktoriyel = 1
        while (num > 0){
            faktoriyel *= num
            num--
        }
        return faktoriyel
    }

    fun eSay(kelime:String) : Int{
        var sayi = 0
        val range = kelime.length - 1
        for (i in 0..range){
            if (kelime[i] == 'e'){
                sayi++
            }
        }
        return sayi
    }
}