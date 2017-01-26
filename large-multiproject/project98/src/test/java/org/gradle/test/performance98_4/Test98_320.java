package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_320 {
    private final Production98_320 production = new Production98_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}