package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12085 {
    private final Productionnull_12085 production = new Productionnull_12085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}