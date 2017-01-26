package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_1 {
    private final Production98_1 production = new Production98_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}