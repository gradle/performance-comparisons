package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47345 {
    private final Productionnull_47345 production = new Productionnull_47345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}