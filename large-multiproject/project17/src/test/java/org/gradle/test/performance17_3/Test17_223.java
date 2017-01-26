package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_223 {
    private final Production17_223 production = new Production17_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}