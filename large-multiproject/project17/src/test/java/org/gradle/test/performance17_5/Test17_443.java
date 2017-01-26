package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_443 {
    private final Production17_443 production = new Production17_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}