package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_132 {
    private final Production43_132 production = new Production43_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}