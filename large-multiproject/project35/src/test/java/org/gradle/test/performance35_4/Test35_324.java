package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_324 {
    private final Production35_324 production = new Production35_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}