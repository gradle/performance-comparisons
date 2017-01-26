package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_342 {
    private final Production25_342 production = new Production25_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}