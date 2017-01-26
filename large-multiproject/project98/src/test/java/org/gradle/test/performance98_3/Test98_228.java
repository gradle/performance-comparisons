package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_228 {
    private final Production98_228 production = new Production98_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}