package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_217 {
    private final Production25_217 production = new Production25_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}