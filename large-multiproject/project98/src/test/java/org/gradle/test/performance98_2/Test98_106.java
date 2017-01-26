package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_106 {
    private final Production98_106 production = new Production98_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}