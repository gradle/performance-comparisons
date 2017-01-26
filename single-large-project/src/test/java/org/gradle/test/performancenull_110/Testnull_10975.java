package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10975 {
    private final Productionnull_10975 production = new Productionnull_10975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}