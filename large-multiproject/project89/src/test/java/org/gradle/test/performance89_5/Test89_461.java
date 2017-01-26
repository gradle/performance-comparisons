package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_461 {
    private final Production89_461 production = new Production89_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}