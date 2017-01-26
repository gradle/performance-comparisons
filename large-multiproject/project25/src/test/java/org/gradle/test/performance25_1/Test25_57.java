package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_57 {
    private final Production25_57 production = new Production25_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}