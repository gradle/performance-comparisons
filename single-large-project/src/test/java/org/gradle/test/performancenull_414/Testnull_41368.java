package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41368 {
    private final Productionnull_41368 production = new Productionnull_41368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}