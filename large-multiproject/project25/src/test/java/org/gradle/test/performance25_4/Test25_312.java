package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_312 {
    private final Production25_312 production = new Production25_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}