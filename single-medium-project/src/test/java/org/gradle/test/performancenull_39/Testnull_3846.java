package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3846 {
    private final Productionnull_3846 production = new Productionnull_3846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}