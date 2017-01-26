package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42985 {
    private final Productionnull_42985 production = new Productionnull_42985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}