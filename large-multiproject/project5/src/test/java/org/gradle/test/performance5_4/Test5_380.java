package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_380 {
    private final Production5_380 production = new Production5_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}