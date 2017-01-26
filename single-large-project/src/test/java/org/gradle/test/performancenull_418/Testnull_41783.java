package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41783 {
    private final Productionnull_41783 production = new Productionnull_41783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}