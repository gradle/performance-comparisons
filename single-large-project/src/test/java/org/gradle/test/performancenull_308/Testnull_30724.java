package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30724 {
    private final Productionnull_30724 production = new Productionnull_30724("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}