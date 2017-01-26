package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4929 {
    private final Productionnull_4929 production = new Productionnull_4929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}