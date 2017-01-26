package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_279 {
    private final Production94_279 production = new Production94_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}