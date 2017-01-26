package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30769 {
    private final Productionnull_30769 production = new Productionnull_30769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}