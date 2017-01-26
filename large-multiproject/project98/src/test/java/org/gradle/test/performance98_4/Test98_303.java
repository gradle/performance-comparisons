package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_303 {
    private final Production98_303 production = new Production98_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}