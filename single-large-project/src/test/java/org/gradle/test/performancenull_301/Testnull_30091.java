package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30091 {
    private final Productionnull_30091 production = new Productionnull_30091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}