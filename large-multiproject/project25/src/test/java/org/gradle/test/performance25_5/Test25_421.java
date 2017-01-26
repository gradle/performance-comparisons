package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_421 {
    private final Production25_421 production = new Production25_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}