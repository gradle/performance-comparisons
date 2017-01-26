package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_380 {
    private final Production99_380 production = new Production99_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}