package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_400 {
    private final Production25_400 production = new Production25_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}