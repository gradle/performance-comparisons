package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_252 {
    private final Production25_252 production = new Production25_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}