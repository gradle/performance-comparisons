package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34929 {
    private final Productionnull_34929 production = new Productionnull_34929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}