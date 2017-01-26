package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_193 {
    private final Production25_193 production = new Production25_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}