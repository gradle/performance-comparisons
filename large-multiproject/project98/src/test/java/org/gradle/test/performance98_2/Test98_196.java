package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_196 {
    private final Production98_196 production = new Production98_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}