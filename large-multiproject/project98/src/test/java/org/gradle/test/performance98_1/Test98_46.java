package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_46 {
    private final Production98_46 production = new Production98_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}