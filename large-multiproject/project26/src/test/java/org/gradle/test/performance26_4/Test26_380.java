package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_380 {
    private final Production26_380 production = new Production26_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}