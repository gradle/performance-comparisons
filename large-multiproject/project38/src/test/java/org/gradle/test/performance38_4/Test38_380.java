package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_380 {
    private final Production38_380 production = new Production38_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}