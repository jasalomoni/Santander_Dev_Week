package com.one.digitalinnovation.santanderdevweek.data.local

import com.one.digitalinnovation.santanderdevweek.data.Cartao
import com.one.digitalinnovation.santanderdevweek.data.Cliente
import com.one.digitalinnovation.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta {

        val cliente = Cliente("José Augusto")
        val cartao = Cartao("9870")
        return Conta(
                "1234567-8",
                "2030-4",
                "R$ 2.350,00",
                "R$ 3.800,00",
                cliente,
                cartao
        )
    }
}