package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_459 {
    private final Production17_459 production = new Production17_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}