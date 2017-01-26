package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_263 {
    private final Production31_263 production = new Production31_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}