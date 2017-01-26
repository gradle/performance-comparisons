package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_274 {
    private final Production25_274 production = new Production25_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}