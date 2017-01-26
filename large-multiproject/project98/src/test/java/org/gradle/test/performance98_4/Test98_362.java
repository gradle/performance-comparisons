package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_362 {
    private final Production98_362 production = new Production98_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}