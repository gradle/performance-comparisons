package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_371 {
    private final Production25_371 production = new Production25_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}