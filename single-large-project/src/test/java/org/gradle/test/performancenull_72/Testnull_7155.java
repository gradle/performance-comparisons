package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7155 {
    private final Productionnull_7155 production = new Productionnull_7155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}