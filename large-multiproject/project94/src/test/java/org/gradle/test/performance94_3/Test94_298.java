package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_298 {
    private final Production94_298 production = new Production94_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}