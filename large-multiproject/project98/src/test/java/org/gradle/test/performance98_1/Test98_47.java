package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_47 {
    private final Production98_47 production = new Production98_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}