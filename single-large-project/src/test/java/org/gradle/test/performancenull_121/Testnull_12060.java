package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12060 {
    private final Productionnull_12060 production = new Productionnull_12060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}