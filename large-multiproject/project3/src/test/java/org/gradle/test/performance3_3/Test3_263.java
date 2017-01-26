package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_263 {
    private final Production3_263 production = new Production3_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}