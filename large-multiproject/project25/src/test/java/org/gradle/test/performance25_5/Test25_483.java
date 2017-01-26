package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_483 {
    private final Production25_483 production = new Production25_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}