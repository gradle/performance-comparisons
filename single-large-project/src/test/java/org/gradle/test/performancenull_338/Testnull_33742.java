package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33742 {
    private final Productionnull_33742 production = new Productionnull_33742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}