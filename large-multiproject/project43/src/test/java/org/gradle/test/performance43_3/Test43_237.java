package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_237 {
    private final Production43_237 production = new Production43_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}