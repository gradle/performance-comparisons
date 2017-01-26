package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_104 {
    private final Production13_104 production = new Production13_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}