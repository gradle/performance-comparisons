package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_114 {
    private final Production25_114 production = new Production25_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}