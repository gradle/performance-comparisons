package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25968 {
    private final Productionnull_25968 production = new Productionnull_25968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}