package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_368 {
    private final Production17_368 production = new Production17_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}