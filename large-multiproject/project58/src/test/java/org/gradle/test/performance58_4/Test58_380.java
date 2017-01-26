package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_380 {
    private final Production58_380 production = new Production58_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}