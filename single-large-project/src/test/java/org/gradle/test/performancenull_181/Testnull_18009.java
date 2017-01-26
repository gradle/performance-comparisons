package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18009 {
    private final Productionnull_18009 production = new Productionnull_18009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}