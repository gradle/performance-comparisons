package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28175 {
    private final Productionnull_28175 production = new Productionnull_28175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}