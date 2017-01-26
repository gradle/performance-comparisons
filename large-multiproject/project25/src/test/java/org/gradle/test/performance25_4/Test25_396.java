package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_396 {
    private final Production25_396 production = new Production25_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}