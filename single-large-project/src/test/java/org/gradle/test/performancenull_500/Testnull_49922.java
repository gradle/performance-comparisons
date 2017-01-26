package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49922 {
    private final Productionnull_49922 production = new Productionnull_49922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}