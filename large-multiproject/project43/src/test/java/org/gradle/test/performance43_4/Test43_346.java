package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_346 {
    private final Production43_346 production = new Production43_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}