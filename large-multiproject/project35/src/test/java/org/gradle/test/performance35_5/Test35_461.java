package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_461 {
    private final Production35_461 production = new Production35_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}