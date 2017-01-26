package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_376 {
    private final Production43_376 production = new Production43_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}