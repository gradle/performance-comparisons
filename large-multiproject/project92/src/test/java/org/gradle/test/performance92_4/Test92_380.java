package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_380 {
    private final Production92_380 production = new Production92_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}