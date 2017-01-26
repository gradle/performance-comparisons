package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_402 {
    private final Production17_402 production = new Production17_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}