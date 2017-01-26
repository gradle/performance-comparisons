package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_355 {
    private final Production43_355 production = new Production43_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}