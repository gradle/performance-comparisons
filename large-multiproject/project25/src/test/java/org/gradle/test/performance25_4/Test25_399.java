package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_399 {
    private final Production25_399 production = new Production25_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}