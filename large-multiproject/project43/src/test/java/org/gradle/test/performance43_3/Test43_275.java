package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_275 {
    private final Production43_275 production = new Production43_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}