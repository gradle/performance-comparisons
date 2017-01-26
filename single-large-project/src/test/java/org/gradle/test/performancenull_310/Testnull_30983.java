package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30983 {
    private final Productionnull_30983 production = new Productionnull_30983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}