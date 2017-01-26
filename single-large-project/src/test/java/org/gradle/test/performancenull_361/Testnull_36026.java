package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36026 {
    private final Productionnull_36026 production = new Productionnull_36026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}