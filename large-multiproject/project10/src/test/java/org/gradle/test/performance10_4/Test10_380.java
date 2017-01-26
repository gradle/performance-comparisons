package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_380 {
    private final Production10_380 production = new Production10_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}