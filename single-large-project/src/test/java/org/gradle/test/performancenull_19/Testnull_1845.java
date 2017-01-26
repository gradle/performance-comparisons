package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1845 {
    private final Productionnull_1845 production = new Productionnull_1845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}