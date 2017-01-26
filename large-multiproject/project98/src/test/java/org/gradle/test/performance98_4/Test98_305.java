package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_305 {
    private final Production98_305 production = new Production98_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}