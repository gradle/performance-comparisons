package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40142 {
    private final Productionnull_40142 production = new Productionnull_40142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}