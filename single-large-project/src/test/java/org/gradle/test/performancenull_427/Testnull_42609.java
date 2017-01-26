package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42609 {
    private final Productionnull_42609 production = new Productionnull_42609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}