package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30402 {
    private final Productionnull_30402 production = new Productionnull_30402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}