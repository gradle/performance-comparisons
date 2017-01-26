package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_11 {
    private final Production17_11 production = new Production17_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}