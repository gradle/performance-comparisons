package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17126 {
    private final Productionnull_17126 production = new Productionnull_17126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}