package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43092 {
    private final Productionnull_43092 production = new Productionnull_43092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}