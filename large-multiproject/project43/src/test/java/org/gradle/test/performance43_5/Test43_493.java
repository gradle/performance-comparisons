package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_493 {
    private final Production43_493 production = new Production43_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}