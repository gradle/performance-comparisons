package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17140 {
    private final Productionnull_17140 production = new Productionnull_17140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}