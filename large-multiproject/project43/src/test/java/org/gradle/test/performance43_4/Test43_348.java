package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_348 {
    private final Production43_348 production = new Production43_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}