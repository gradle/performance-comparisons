package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_263 {
    private final Production16_263 production = new Production16_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}