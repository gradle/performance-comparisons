package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_470 {
    private final Production25_470 production = new Production25_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}