package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_461 {
    private final Production47_461 production = new Production47_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}