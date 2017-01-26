package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_181 {
    private final Production13_181 production = new Production13_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}