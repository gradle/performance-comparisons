package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_483 {
    private final Production43_483 production = new Production43_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}