package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_107 {
    private final Production13_107 production = new Production13_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}