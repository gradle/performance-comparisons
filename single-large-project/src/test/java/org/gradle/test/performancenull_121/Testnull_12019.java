package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12019 {
    private final Productionnull_12019 production = new Productionnull_12019("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}