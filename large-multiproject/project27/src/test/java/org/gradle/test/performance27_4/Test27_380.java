package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_380 {
    private final Production27_380 production = new Production27_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}