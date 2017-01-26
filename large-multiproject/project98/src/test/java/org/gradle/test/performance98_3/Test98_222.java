package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_222 {
    private final Production98_222 production = new Production98_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}