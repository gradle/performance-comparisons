package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_177 {
    private final Production25_177 production = new Production25_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}