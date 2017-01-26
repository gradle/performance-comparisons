package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36260 {
    private final Productionnull_36260 production = new Productionnull_36260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}