package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_322 {
    private final Production25_322 production = new Production25_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}