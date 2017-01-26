package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_428 {
    private final Production39_428 production = new Production39_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}