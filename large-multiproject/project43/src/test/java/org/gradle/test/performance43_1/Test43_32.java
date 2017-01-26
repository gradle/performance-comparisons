package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_32 {
    private final Production43_32 production = new Production43_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}