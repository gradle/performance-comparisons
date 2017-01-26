package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_110 {
    private final Production31_110 production = new Production31_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}