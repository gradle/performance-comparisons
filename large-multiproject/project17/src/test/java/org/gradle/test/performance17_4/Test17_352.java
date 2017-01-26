package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_352 {
    private final Production17_352 production = new Production17_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}