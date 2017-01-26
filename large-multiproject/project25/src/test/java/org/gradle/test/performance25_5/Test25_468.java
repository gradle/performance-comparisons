package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_468 {
    private final Production25_468 production = new Production25_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}