package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5042 {
    private final Productionnull_5042 production = new Productionnull_5042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}