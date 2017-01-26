package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23084 {
    private final Productionnull_23084 production = new Productionnull_23084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}