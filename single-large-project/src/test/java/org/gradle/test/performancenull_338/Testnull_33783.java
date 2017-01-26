package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33783 {
    private final Productionnull_33783 production = new Productionnull_33783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}