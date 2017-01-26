package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_156 {
    private final Production25_156 production = new Production25_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}