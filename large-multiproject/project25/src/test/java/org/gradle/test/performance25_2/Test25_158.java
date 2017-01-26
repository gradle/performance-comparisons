package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_158 {
    private final Production25_158 production = new Production25_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}