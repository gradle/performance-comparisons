package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33961 {
    private final Productionnull_33961 production = new Productionnull_33961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}