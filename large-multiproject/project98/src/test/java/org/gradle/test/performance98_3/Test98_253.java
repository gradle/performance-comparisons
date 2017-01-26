package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_253 {
    private final Production98_253 production = new Production98_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}