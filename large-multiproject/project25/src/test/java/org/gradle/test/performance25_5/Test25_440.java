package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_440 {
    private final Production25_440 production = new Production25_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}