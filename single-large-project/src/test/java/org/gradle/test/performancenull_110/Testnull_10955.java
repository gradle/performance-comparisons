package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10955 {
    private final Productionnull_10955 production = new Productionnull_10955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}