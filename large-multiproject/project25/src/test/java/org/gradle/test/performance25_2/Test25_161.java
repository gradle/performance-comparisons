package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_161 {
    private final Production25_161 production = new Production25_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}