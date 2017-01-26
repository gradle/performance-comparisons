package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23081 {
    private final Productionnull_23081 production = new Productionnull_23081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}