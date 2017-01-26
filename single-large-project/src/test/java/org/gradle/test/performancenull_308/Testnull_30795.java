package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30795 {
    private final Productionnull_30795 production = new Productionnull_30795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}