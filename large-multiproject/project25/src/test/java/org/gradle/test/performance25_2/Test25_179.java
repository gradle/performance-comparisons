package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_179 {
    private final Production25_179 production = new Production25_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}