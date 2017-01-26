package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_360 {
    private final Production98_360 production = new Production98_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}