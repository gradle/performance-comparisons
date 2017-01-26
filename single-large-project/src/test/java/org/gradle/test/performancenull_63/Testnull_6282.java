package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6282 {
    private final Productionnull_6282 production = new Productionnull_6282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}