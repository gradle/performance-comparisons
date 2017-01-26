package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_32 {
    private final Production17_32 production = new Production17_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}