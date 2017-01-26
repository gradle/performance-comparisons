package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_20 {
    private final Production43_20 production = new Production43_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}