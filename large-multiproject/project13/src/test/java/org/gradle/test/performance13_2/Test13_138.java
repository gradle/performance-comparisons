package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_138 {
    private final Production13_138 production = new Production13_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}