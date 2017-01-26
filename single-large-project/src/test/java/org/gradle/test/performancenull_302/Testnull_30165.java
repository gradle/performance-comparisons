package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30165 {
    private final Productionnull_30165 production = new Productionnull_30165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}