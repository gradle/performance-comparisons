package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_321 {
    private final Production25_321 production = new Production25_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}