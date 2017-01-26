package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_380 {
    private final Production3_380 production = new Production3_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}