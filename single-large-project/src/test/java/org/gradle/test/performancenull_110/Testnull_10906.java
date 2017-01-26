package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10906 {
    private final Productionnull_10906 production = new Productionnull_10906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}