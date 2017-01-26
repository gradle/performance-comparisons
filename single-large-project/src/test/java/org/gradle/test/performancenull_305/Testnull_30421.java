package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30421 {
    private final Productionnull_30421 production = new Productionnull_30421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}