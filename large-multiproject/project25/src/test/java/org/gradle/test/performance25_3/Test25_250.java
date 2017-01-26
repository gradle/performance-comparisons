package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_250 {
    private final Production25_250 production = new Production25_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}