package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37267 {
    private final Productionnull_37267 production = new Productionnull_37267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}