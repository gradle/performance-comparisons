package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_499 {
    private final Production25_499 production = new Production25_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}