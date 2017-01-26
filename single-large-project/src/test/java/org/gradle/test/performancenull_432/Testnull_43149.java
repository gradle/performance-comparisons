package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43149 {
    private final Productionnull_43149 production = new Productionnull_43149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}