package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47390 {
    private final Productionnull_47390 production = new Productionnull_47390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}