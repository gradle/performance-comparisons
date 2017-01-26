package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30028 {
    private final Productionnull_30028 production = new Productionnull_30028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}