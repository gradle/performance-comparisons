package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_245 {
    private final Production94_245 production = new Production94_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}