package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_380 {
    private final Production74_380 production = new Production74_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}