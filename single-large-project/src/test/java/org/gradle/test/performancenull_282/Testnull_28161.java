package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28161 {
    private final Productionnull_28161 production = new Productionnull_28161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}