package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_179 {
    private final Production17_179 production = new Production17_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}