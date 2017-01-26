package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_121 {
    private final Production25_121 production = new Production25_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}