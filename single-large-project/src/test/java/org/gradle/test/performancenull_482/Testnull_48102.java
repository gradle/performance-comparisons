package org.gradle.test.performancenull_482;

import static org.junit.Assert.*;

public class Testnull_48102 {
    private final Productionnull_48102 production = new Productionnull_48102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}