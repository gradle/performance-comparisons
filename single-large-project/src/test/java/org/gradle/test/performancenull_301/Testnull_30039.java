package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30039 {
    private final Productionnull_30039 production = new Productionnull_30039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}