package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_380 {
    private final Production7_380 production = new Production7_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}