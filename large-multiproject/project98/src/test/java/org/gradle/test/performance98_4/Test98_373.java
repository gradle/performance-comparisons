package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_373 {
    private final Production98_373 production = new Production98_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}