package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_474 {
    private final Production13_474 production = new Production13_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}