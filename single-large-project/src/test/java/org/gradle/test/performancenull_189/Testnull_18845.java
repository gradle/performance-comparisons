package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18845 {
    private final Productionnull_18845 production = new Productionnull_18845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}