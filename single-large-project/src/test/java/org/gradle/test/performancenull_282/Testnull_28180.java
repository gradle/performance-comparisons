package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28180 {
    private final Productionnull_28180 production = new Productionnull_28180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}