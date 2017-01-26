package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_391 {
    private final Production94_391 production = new Production94_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}