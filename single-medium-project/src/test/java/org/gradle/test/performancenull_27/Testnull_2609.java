package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2609 {
    private final Productionnull_2609 production = new Productionnull_2609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}