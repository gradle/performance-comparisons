package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2028 {
    private final Productionnull_2028 production = new Productionnull_2028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}