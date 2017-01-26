package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_380 {
    private final Production89_380 production = new Production89_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}