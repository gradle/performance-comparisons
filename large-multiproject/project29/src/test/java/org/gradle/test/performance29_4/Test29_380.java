package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_380 {
    private final Production29_380 production = new Production29_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}