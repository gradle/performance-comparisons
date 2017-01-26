package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_197 {
    private final Production17_197 production = new Production17_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}