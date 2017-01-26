package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_140 {
    private final Production25_140 production = new Production25_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}