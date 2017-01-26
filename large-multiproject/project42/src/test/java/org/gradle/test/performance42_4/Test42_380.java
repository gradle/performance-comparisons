package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_380 {
    private final Production42_380 production = new Production42_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}