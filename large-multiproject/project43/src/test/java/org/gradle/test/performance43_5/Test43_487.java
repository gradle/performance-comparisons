package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_487 {
    private final Production43_487 production = new Production43_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}