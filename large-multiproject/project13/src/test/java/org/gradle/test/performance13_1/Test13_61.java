package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_61 {
    private final Production13_61 production = new Production13_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}