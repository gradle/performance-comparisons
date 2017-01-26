package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_459 {
    private final Production43_459 production = new Production43_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}