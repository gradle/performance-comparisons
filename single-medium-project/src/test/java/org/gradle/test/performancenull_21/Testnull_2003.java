package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2003 {
    private final Productionnull_2003 production = new Productionnull_2003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}