package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_23 {
    private final Production17_23 production = new Production17_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}