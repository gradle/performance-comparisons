package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30547 {
    private final Productionnull_30547 production = new Productionnull_30547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}