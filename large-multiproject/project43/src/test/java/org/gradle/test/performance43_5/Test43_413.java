package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_413 {
    private final Production43_413 production = new Production43_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}