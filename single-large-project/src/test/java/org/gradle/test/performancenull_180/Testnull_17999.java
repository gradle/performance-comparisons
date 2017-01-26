package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17999 {
    private final Productionnull_17999 production = new Productionnull_17999("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}