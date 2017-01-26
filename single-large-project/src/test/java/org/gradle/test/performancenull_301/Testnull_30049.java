package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30049 {
    private final Productionnull_30049 production = new Productionnull_30049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}