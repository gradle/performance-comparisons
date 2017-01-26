package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_397 {
    private final Production94_397 production = new Production94_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}