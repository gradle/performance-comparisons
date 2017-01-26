package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40282 {
    private final Productionnull_40282 production = new Productionnull_40282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}