package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30541 {
    private final Productionnull_30541 production = new Productionnull_30541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}