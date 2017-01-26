package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_101 {
    private final Production17_101 production = new Production17_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}