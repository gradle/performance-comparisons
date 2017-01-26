package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_455 {
    private final Production25_455 production = new Production25_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}