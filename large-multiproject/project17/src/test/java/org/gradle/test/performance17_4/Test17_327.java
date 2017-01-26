package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_327 {
    private final Production17_327 production = new Production17_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}