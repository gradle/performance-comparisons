package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_87 {
    private final Production98_87 production = new Production98_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}