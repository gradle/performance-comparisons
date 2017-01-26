package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_140 {
    private final Production98_140 production = new Production98_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}