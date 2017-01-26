package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18006 {
    private final Productionnull_18006 production = new Productionnull_18006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}