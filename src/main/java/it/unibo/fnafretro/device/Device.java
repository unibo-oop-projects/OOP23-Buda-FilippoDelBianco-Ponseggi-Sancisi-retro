package it.unibo.fnafretro.device;

/**
 * Interfaccia base per i devices del gioco (es. porte luci ventilatore)
 * @author Davide Sancisi
 */
public interface Device {

    /**
     * Attiva il dispositivo.
     */
    void switchOn();

    /**
     * Disttiva il dispositivo.
     */
    void switchOff();

    /**
     * @return  {@code true} se il dispositivo Ã¨ attivo, {@code false}
     *          altrimenti
     */
    boolean isSwitchedOn();

}
