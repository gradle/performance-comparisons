package org.gradle.test.performancenull_290;

import static org.junit.Assert.*;

public class Testnull_28963 {
    private final Productionnull_28963 production = new Productionnull_28963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}