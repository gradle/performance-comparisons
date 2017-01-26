package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_101 {
    private final Production43_101 production = new Production43_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}