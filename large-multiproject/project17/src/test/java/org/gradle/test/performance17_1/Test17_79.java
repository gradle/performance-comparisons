package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_79 {
    private final Production17_79 production = new Production17_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}