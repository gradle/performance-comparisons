package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_380 {
    private final Production60_380 production = new Production60_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}