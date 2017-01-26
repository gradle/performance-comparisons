package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42116 {
    private final Productionnull_42116 production = new Productionnull_42116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}