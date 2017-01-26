package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_380 {
    private final Production30_380 production = new Production30_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}