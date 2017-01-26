package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_240 {
    private final Production43_240 production = new Production43_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}