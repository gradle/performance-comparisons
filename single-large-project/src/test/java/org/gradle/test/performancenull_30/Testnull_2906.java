package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2906 {
    private final Productionnull_2906 production = new Productionnull_2906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}