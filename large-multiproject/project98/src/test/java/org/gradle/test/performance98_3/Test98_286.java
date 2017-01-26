package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_286 {
    private final Production98_286 production = new Production98_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}