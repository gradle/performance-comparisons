package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_292 {
    private final Production94_292 production = new Production94_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}