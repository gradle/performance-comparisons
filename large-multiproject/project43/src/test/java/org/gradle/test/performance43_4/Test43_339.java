package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_339 {
    private final Production43_339 production = new Production43_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}