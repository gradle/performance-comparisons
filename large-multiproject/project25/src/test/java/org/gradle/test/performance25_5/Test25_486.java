package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_486 {
    private final Production25_486 production = new Production25_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}