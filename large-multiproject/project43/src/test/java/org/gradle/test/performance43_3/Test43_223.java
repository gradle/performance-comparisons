package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_223 {
    private final Production43_223 production = new Production43_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}