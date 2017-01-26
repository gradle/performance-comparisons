package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_461 {
    private final Production20_461 production = new Production20_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}