package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41769 {
    private final Productionnull_41769 production = new Productionnull_41769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}