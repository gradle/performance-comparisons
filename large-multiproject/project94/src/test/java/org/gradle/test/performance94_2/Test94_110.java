package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_110 {
    private final Production94_110 production = new Production94_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}