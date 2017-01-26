package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_158 {
    private final Production17_158 production = new Production17_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}