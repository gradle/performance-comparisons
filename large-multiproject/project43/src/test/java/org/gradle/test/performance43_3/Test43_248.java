package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_248 {
    private final Production43_248 production = new Production43_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}