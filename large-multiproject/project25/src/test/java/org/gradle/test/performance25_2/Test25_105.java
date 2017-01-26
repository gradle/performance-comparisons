package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_105 {
    private final Production25_105 production = new Production25_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}