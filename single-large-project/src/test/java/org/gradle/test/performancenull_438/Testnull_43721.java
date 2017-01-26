package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43721 {
    private final Productionnull_43721 production = new Productionnull_43721("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}