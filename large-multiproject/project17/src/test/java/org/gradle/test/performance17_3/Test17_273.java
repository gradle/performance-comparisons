package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_273 {
    private final Production17_273 production = new Production17_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}