package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25180 {
    private final Productionnull_25180 production = new Productionnull_25180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}