package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_21 {
    private final Production17_21 production = new Production17_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}