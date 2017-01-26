package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_487 {
    private final Production94_487 production = new Production94_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}