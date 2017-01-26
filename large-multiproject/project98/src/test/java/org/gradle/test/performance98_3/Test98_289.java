package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_289 {
    private final Production98_289 production = new Production98_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}