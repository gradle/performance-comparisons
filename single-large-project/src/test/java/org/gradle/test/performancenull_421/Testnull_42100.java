package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42100 {
    private final Productionnull_42100 production = new Productionnull_42100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}