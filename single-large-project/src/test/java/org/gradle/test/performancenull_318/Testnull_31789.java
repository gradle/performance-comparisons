package org.gradle.test.performancenull_318;

import static org.junit.Assert.*;

public class Testnull_31789 {
    private final Productionnull_31789 production = new Productionnull_31789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}