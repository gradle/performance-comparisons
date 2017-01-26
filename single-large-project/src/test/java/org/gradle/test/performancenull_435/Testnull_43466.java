package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43466 {
    private final Productionnull_43466 production = new Productionnull_43466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}