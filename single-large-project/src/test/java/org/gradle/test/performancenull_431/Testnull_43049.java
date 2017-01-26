package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43049 {
    private final Productionnull_43049 production = new Productionnull_43049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}