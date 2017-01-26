package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_380 {
    private final Production1_380 production = new Production1_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}