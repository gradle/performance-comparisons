package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_428 {
    private final Production43_428 production = new Production43_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}