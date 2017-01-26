package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_478 {
    private final Production94_478 production = new Production94_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}