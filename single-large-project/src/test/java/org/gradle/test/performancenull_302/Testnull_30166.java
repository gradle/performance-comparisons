package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30166 {
    private final Productionnull_30166 production = new Productionnull_30166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}