package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41723 {
    private final Productionnull_41723 production = new Productionnull_41723("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}