package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25942 {
    private final Productionnull_25942 production = new Productionnull_25942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}