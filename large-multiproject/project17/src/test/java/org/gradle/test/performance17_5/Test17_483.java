package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_483 {
    private final Production17_483 production = new Production17_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}