package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30587 {
    private final Productionnull_30587 production = new Productionnull_30587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}