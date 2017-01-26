package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30083 {
    private final Productionnull_30083 production = new Productionnull_30083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}