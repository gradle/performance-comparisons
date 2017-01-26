package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_461 {
    private final Production84_461 production = new Production84_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}