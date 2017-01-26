package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_343 {
    private final Production25_343 production = new Production25_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}