package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_263 {
    private final Production8_263 production = new Production8_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}