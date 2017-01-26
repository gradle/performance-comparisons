package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_461 {
    private final Production13_461 production = new Production13_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}