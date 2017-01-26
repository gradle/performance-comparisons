package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_180 {
    private final Production25_180 production = new Production25_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}