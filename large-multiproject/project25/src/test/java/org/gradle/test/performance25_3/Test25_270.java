package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_270 {
    private final Production25_270 production = new Production25_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}