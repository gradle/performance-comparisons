package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_377 {
    private final Production25_377 production = new Production25_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}