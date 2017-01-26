package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43180 {
    private final Productionnull_43180 production = new Productionnull_43180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}