package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3203 {
    private final Productionnull_3203 production = new Productionnull_3203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}