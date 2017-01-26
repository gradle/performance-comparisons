package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42145 {
    private final Productionnull_42145 production = new Productionnull_42145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}