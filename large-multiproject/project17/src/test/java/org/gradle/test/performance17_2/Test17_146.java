package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_146 {
    private final Production17_146 production = new Production17_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}