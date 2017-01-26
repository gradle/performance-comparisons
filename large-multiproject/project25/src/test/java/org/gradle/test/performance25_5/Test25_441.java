package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_441 {
    private final Production25_441 production = new Production25_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}