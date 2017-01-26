package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2983 {
    private final Productionnull_2983 production = new Productionnull_2983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}