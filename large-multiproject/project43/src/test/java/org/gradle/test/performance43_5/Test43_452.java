package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_452 {
    private final Production43_452 production = new Production43_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}