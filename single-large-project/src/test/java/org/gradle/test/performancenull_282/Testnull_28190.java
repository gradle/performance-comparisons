package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28190 {
    private final Productionnull_28190 production = new Productionnull_28190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}