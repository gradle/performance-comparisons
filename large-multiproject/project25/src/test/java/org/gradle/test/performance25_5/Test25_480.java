package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_480 {
    private final Production25_480 production = new Production25_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}