package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3075 {
    private final Productionnull_3075 production = new Productionnull_3075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}