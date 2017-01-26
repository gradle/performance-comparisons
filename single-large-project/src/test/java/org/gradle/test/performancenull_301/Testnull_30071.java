package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30071 {
    private final Productionnull_30071 production = new Productionnull_30071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}