package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_32 {
    private final Production25_32 production = new Production25_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}