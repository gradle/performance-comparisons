package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_487 {
    private final Production17_487 production = new Production17_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}