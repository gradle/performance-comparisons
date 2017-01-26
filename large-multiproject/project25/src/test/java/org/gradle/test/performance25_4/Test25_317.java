package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_317 {
    private final Production25_317 production = new Production25_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}