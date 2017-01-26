package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_141 {
    private final Production94_141 production = new Production94_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}