package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_62 {
    private final Production13_62 production = new Production13_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}