package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_489 {
    private final Production25_489 production = new Production25_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}