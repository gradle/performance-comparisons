package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_301 {
    private final Production25_301 production = new Production25_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}