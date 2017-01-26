package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_375 {
    private final Production43_375 production = new Production43_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}