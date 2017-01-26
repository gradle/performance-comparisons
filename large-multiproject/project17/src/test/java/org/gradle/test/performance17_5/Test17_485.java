package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_485 {
    private final Production17_485 production = new Production17_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}