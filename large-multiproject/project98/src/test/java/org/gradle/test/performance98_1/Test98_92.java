package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_92 {
    private final Production98_92 production = new Production98_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}