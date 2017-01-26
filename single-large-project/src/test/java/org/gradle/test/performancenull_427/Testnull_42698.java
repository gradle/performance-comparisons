package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42698 {
    private final Productionnull_42698 production = new Productionnull_42698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}