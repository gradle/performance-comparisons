package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_391 {
    private final Production43_391 production = new Production43_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}