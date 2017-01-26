package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40241 {
    private final Productionnull_40241 production = new Productionnull_40241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}