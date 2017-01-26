package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25970 {
    private final Productionnull_25970 production = new Productionnull_25970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}