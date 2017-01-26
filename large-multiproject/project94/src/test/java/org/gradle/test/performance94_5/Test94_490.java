package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_490 {
    private final Production94_490 production = new Production94_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}