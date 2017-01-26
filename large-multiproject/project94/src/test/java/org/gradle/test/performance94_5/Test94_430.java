package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_430 {
    private final Production94_430 production = new Production94_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}