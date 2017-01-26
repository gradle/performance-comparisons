package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_83 {
    private final Production25_83 production = new Production25_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}