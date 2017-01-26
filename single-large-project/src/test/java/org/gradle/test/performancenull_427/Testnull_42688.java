package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42688 {
    private final Productionnull_42688 production = new Productionnull_42688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}