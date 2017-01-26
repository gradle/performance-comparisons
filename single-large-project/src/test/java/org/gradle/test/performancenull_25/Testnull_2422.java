package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2422 {
    private final Productionnull_2422 production = new Productionnull_2422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}