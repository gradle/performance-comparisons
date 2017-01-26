package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42028 {
    private final Productionnull_42028 production = new Productionnull_42028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}