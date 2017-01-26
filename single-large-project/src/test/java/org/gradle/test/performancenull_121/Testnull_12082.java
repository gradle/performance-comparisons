package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12082 {
    private final Productionnull_12082 production = new Productionnull_12082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}