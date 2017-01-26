package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42849 {
    private final Productionnull_42849 production = new Productionnull_42849("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}