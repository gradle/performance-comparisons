package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_245 {
    private final Production17_245 production = new Production17_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}