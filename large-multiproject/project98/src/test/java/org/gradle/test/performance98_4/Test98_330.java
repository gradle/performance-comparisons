package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_330 {
    private final Production98_330 production = new Production98_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}