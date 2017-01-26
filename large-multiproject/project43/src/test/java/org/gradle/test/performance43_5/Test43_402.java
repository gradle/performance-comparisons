package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_402 {
    private final Production43_402 production = new Production43_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}