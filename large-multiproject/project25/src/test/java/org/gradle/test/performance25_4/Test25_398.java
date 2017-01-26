package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_398 {
    private final Production25_398 production = new Production25_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}