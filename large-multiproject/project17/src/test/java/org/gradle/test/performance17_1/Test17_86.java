package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_86 {
    private final Production17_86 production = new Production17_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}