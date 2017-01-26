package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_461 {
    private final Production8_461 production = new Production8_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}