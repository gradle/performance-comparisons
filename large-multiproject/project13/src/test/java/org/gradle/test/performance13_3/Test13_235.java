package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_235 {
    private final Production13_235 production = new Production13_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}