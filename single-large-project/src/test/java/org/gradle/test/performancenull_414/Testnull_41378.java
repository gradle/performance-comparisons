package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41378 {
    private final Productionnull_41378 production = new Productionnull_41378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}