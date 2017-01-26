package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_214 {
    private final Production98_214 production = new Production98_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}