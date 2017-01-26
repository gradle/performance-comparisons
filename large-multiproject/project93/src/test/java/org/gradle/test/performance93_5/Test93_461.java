package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_461 {
    private final Production93_461 production = new Production93_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}