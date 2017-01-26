package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9490 {
    private final Productionnull_9490 production = new Productionnull_9490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}