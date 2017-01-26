package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30009 {
    private final Productionnull_30009 production = new Productionnull_30009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}