package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5929 {
    private final Productionnull_5929 production = new Productionnull_5929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}