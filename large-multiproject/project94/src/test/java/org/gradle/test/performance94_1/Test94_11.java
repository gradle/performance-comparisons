package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_11 {
    private final Production94_11 production = new Production94_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}