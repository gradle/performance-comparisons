package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_380 {
    private final Production43_380 production = new Production43_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}