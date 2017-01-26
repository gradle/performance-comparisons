package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_297 {
    private final Production25_297 production = new Production25_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}