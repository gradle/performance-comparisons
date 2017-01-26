package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_324 {
    private final Production98_324 production = new Production98_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}