package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_346 {
    private final Production94_346 production = new Production94_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}