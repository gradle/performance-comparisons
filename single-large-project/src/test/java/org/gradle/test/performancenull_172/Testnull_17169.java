package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17169 {
    private final Productionnull_17169 production = new Productionnull_17169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}