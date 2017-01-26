package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_402 {
    private final Production94_402 production = new Production94_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}