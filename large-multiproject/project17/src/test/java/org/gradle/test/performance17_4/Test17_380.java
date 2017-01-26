package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_380 {
    private final Production17_380 production = new Production17_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}