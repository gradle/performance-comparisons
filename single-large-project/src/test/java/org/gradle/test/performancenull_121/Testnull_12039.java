package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12039 {
    private final Productionnull_12039 production = new Productionnull_12039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}