package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_142 {
    private final Production25_142 production = new Production25_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}