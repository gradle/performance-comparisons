package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30100 {
    private final Productionnull_30100 production = new Productionnull_30100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}