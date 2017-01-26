package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_270 {
    private final Production13_270 production = new Production13_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}