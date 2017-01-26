package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28166 {
    private final Productionnull_28166 production = new Productionnull_28166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}