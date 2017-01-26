package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_136 {
    private final Production25_136 production = new Production25_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}