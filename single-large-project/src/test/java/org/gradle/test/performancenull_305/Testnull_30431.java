package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30431 {
    private final Productionnull_30431 production = new Productionnull_30431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}