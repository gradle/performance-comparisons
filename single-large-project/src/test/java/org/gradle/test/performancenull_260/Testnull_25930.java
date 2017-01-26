package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25930 {
    private final Productionnull_25930 production = new Productionnull_25930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}