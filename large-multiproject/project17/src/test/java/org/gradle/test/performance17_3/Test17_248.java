package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_248 {
    private final Production17_248 production = new Production17_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}