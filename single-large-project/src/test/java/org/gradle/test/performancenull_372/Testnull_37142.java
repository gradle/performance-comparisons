package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37142 {
    private final Productionnull_37142 production = new Productionnull_37142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}