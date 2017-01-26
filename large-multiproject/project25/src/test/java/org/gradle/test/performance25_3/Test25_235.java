package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_235 {
    private final Production25_235 production = new Production25_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}