package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_359 {
    private final Production17_359 production = new Production17_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}