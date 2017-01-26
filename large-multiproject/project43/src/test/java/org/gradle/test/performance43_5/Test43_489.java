package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_489 {
    private final Production43_489 production = new Production43_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}