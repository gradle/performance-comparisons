package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_361 {
    private final Production98_361 production = new Production98_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}