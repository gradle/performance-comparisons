package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_169 {
    private final Production43_169 production = new Production43_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}