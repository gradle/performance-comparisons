package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_215 {
    private final Production25_215 production = new Production25_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}