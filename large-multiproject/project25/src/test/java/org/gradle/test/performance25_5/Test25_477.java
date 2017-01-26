package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_477 {
    private final Production25_477 production = new Production25_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}