package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31845 {
    private final Productionnull_31845 production = new Productionnull_31845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}