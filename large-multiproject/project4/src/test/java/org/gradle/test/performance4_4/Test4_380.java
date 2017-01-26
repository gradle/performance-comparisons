package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_380 {
    private final Production4_380 production = new Production4_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}