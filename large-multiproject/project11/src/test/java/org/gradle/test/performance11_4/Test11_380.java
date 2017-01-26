package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_380 {
    private final Production11_380 production = new Production11_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}