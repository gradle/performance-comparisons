package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10268 {
    private final Productionnull_10268 production = new Productionnull_10268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}