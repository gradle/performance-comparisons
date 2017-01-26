package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_266 {
    private final Production98_266 production = new Production98_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}