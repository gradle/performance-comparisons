package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30022 {
    private final Productionnull_30022 production = new Productionnull_30022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}