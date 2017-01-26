package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_177 {
    private final Production17_177 production = new Production17_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}