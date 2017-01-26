package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30433 {
    private final Productionnull_30433 production = new Productionnull_30433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}