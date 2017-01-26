package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42165 {
    private final Productionnull_42165 production = new Productionnull_42165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}