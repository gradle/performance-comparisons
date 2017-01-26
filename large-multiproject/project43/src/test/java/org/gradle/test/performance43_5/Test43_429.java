package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_429 {
    private final Production43_429 production = new Production43_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}