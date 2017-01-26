package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_380 {
    private final Production94_380 production = new Production94_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}