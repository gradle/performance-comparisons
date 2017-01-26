package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15845 {
    private final Productionnull_15845 production = new Productionnull_15845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}