package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_359 {
    private final Production43_359 production = new Production43_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}