package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_168 {
    private final Production98_168 production = new Production98_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}