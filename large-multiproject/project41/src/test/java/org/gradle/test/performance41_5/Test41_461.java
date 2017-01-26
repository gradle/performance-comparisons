package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_461 {
    private final Production41_461 production = new Production41_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}