package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30046 {
    private final Productionnull_30046 production = new Productionnull_30046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}