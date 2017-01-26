package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_380 {
    private final Production49_380 production = new Production49_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}