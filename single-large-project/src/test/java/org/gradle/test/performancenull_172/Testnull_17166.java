package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17166 {
    private final Productionnull_17166 production = new Productionnull_17166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}