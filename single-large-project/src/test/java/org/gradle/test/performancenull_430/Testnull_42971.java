package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42971 {
    private final Productionnull_42971 production = new Productionnull_42971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}