package br.com.scampini.safenote.types;

/**
 * Created by romuloscampini on 9/1/17.
 *
 * @author romuloscampini
 */
public enum TipoDocumento {

    COMPROVANTE_PAGAMENTO("Comprovante de Pagamento"),
    NOTA_FISCAL("Nota Fiscal"),
    BOLETO("Boleto ou Documento para Pagamento"),
    REGISTRO_FISCAL("Registro Fiscal"),
    OUTROS("Outros");

    private String descricao;

    TipoDocumento(String descricao){ this.descricao = descricao; }

    public String getDescricao(){
        return descricao;
    }

    }
