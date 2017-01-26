package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_380 {
    private final Production73_380 production = new Production73_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}