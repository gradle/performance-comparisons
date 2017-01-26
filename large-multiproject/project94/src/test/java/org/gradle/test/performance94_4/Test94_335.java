package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_335 {
    private final Production94_335 production = new Production94_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}