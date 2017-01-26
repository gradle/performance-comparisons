package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_480 {
    private final Production43_480 production = new Production43_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}