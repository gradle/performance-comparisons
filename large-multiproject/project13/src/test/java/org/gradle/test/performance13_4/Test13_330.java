package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_330 {
    private final Production13_330 production = new Production13_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}