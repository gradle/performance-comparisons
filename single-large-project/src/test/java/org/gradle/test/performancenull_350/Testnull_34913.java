package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34913 {
    private final Productionnull_34913 production = new Productionnull_34913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}