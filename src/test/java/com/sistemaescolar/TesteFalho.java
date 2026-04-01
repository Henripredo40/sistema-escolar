package com.sistemaescolar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteFalho {

    @Test
    public void testeQueFalha() {
        assertEquals(10, 2 + 2);
    }
}