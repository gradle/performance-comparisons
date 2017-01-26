package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_45000 {
    private final Productionnull_45000 production = new Productionnull_45000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}