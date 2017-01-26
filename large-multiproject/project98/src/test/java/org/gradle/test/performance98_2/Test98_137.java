package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_137 {
    private final Production98_137 production = new Production98_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}