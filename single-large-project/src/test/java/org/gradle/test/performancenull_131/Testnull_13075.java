package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13075 {
    private final Productionnull_13075 production = new Productionnull_13075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}