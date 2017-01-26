package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_333 {
    private final Production17_333 production = new Production17_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}