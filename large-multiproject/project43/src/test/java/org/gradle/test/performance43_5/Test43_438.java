package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_438 {
    private final Production43_438 production = new Production43_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}