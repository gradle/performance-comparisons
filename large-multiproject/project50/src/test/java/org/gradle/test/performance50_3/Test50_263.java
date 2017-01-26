package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_263 {
    private final Production50_263 production = new Production50_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}