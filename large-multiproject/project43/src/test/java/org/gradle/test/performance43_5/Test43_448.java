package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_448 {
    private final Production43_448 production = new Production43_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}