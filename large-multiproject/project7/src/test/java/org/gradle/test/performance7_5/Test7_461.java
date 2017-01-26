package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_461 {
    private final Production7_461 production = new Production7_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}