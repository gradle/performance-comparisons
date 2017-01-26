package org.gradle.test.performancenull_483;

import static org.junit.Assert.*;

public class Testnull_48282 {
    private final Productionnull_48282 production = new Productionnull_48282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}