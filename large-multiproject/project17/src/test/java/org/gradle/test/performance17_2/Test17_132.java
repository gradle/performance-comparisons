package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_132 {
    private final Production17_132 production = new Production17_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}