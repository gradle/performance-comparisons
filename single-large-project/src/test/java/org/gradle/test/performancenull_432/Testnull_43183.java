package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43183 {
    private final Productionnull_43183 production = new Productionnull_43183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}