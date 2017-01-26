package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33470 {
    private final Productionnull_33470 production = new Productionnull_33470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}