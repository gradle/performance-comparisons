package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30465 {
    private final Productionnull_30465 production = new Productionnull_30465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}