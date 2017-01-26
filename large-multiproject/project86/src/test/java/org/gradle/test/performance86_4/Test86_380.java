package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_380 {
    private final Production86_380 production = new Production86_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}