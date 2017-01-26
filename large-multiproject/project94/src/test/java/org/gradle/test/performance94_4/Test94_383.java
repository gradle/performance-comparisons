package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_383 {
    private final Production94_383 production = new Production94_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}