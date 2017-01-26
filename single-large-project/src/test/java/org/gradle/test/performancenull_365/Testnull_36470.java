package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36470 {
    private final Productionnull_36470 production = new Productionnull_36470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}