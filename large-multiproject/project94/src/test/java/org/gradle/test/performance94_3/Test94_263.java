package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_263 {
    private final Production94_263 production = new Production94_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}