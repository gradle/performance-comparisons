package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2002 {
    private final Productionnull_2002 production = new Productionnull_2002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}