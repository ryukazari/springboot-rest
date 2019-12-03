package com.quipucamayoc.springbootrest.controller;

import com.quipucamayoc.springbootrest.entity.Pago;
import com.quipucamayoc.springbootrest.entity.request.AddPagoRequest;
import com.quipucamayoc.springbootrest.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PagoController {
    private PagoRepository pagoRepository;

    @Autowired
    public PagoController(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Pago> findAllPagos() {
        return pagoRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public void addPago(@RequestBody AddPagoRequest addPagoRequest) {
        Pago pago = new Pago();
        pago.setCodigo_pago(addPagoRequest.getCodigo_pago());
        pago.setCodigo_operacion_banco(addPagoRequest.getCanal_banco());
        pago.setCanal_banco(addPagoRequest.getCanal_banco());
        pago.setContrapartida(addPagoRequest.getContrapartida());
        pago.setFecha_pago(addPagoRequest.getFecha_pago());
        pago.setFecha_vencimiento(addPagoRequest.getFecha_vencimiento());
        pago.setFk_banco(addPagoRequest.getFk_banco());
        pago.setFk_estado(addPagoRequest.getFk_estado());
        pago.setFk_usuario(addPagoRequest.getFk_usuario());
        pago.setReferencia_adicional(addPagoRequest.getReferencia_adicional());
        pago.setMonto(addPagoRequest.getMonto());
        pago.setMoneda_importe(addPagoRequest.getMoneda_importe());
        pago.setHora_pago(addPagoRequest.getHora_pago());
    }
}