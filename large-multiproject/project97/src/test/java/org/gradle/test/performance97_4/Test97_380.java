package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_380 {
    private final Production97_380 production = new Production97_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}