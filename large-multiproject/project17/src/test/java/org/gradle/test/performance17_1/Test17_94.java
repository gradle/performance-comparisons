package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_94 {
    private final Production17_94 production = new Production17_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}