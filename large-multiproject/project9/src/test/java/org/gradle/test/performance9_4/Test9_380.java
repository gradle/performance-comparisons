package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_380 {
    private final Production9_380 production = new Production9_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}