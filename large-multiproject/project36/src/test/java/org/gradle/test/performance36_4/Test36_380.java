package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_380 {
    private final Production36_380 production = new Production36_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}