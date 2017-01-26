package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_443 {
    private final Production43_443 production = new Production43_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}