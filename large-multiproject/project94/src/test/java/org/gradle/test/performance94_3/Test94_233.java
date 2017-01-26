package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_233 {
    private final Production94_233 production = new Production94_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}