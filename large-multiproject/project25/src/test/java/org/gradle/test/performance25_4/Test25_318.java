package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_318 {
    private final Production25_318 production = new Production25_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}