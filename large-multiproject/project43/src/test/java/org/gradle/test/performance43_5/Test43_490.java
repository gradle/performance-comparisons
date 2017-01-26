package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_490 {
    private final Production43_490 production = new Production43_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}