package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_335 {
    private final Production17_335 production = new Production17_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}