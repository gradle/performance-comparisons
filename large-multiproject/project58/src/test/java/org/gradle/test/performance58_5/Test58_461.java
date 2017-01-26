package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_461 {
    private final Production58_461 production = new Production58_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}