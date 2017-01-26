package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30748 {
    private final Productionnull_30748 production = new Productionnull_30748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}