package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_380 {
    private final Production63_380 production = new Production63_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}