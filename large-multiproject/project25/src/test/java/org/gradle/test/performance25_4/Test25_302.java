package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_302 {
    private final Production25_302 production = new Production25_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}