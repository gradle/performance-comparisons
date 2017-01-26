package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_184 {
    private final Production17_184 production = new Production17_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}