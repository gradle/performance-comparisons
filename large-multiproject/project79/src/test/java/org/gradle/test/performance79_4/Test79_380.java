package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_380 {
    private final Production79_380 production = new Production79_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}