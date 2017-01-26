package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_380 {
    private final Production61_380 production = new Production61_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}