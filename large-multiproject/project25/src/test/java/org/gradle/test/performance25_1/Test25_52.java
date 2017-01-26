package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_52 {
    private final Production25_52 production = new Production25_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}