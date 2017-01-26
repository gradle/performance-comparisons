package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_316 {
    private final Production17_316 production = new Production17_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}