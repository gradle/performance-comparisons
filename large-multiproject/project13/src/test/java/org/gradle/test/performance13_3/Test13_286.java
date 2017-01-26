package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_286 {
    private final Production13_286 production = new Production13_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}