package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35999 {
    private final Productionnull_35999 production = new Productionnull_35999("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}