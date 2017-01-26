package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_453 {
    private final Production17_453 production = new Production17_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}