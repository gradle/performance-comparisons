package org.gradle.test.performancenull_290;

import static org.junit.Assert.*;

public class Testnull_28942 {
    private final Productionnull_28942 production = new Productionnull_28942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}