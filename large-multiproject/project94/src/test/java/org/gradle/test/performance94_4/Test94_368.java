package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_368 {
    private final Production94_368 production = new Production94_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}