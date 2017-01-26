package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_380 {
    private final Production45_380 production = new Production45_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}