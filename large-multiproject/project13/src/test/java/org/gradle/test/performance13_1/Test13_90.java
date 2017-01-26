package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_90 {
    private final Production13_90 production = new Production13_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}