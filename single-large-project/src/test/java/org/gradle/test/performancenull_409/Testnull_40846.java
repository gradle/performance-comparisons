package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40846 {
    private final Productionnull_40846 production = new Productionnull_40846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}