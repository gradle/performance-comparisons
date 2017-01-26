package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_441 {
    private final Production17_441 production = new Production17_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}