package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_335 {
    private final Production43_335 production = new Production43_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}