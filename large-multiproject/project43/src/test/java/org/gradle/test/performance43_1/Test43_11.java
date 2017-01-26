package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_11 {
    private final Production43_11 production = new Production43_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}