package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_104 {
    private final Production98_104 production = new Production98_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}