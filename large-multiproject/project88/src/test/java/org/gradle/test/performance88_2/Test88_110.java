package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_110 {
    private final Production88_110 production = new Production88_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}