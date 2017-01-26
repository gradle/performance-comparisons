package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42926 {
    private final Productionnull_42926 production = new Productionnull_42926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}