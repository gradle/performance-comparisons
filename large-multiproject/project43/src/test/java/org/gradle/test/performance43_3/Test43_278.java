package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_278 {
    private final Production43_278 production = new Production43_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}