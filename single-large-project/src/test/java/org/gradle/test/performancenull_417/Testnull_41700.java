package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41700 {
    private final Productionnull_41700 production = new Productionnull_41700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}