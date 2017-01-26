package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8100 {
    private final Productionnull_8100 production = new Productionnull_8100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}