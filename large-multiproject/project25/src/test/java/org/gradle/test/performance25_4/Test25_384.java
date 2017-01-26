package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_384 {
    private final Production25_384 production = new Production25_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}