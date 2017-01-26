package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_380 {
    private final Production18_380 production = new Production18_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}