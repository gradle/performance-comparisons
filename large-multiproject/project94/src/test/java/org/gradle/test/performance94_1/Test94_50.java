package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_50 {
    private final Production94_50 production = new Production94_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}