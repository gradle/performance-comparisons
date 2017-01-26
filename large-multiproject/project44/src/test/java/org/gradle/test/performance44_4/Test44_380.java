package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_380 {
    private final Production44_380 production = new Production44_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}