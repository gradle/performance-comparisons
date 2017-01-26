package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21645 {
    private final Productionnull_21645 production = new Productionnull_21645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}