package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42153 {
    private final Productionnull_42153 production = new Productionnull_42153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}