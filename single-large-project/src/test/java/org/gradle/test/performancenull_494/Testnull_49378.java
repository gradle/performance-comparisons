package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49378 {
    private final Productionnull_49378 production = new Productionnull_49378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}