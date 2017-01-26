package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_160 {
    private final Production94_160 production = new Production94_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}