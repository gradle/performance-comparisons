package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_180 {
    private final Production43_180 production = new Production43_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}