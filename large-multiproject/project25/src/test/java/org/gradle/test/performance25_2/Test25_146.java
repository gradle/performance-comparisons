package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_146 {
    private final Production25_146 production = new Production25_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}