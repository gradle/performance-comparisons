package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_380 {
    private final Production20_380 production = new Production20_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}