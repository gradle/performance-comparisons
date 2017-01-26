package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_24 {
    private final Production43_24 production = new Production43_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}