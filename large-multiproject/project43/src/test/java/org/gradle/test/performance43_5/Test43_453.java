package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_453 {
    private final Production43_453 production = new Production43_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}