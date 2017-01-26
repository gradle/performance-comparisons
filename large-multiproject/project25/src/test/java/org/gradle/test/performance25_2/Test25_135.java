package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_135 {
    private final Production25_135 production = new Production25_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}