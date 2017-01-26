package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34098 {
    private final Productionnull_34098 production = new Productionnull_34098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}