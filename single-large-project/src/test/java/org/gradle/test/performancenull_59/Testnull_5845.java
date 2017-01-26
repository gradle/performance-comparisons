package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5845 {
    private final Productionnull_5845 production = new Productionnull_5845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}