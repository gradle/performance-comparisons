package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_420 {
    private final Production25_420 production = new Production25_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}