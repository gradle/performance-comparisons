package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_130 {
    private final Production17_130 production = new Production17_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}