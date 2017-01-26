package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25084 {
    private final Productionnull_25084 production = new Productionnull_25084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}