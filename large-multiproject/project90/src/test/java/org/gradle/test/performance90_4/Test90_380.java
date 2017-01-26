package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_380 {
    private final Production90_380 production = new Production90_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}