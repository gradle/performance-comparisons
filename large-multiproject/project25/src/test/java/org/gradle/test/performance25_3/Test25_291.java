package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_291 {
    private final Production25_291 production = new Production25_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}