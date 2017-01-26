package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_474 {
    private final Production98_474 production = new Production98_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}