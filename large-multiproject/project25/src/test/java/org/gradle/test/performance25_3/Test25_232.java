package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_232 {
    private final Production25_232 production = new Production25_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}