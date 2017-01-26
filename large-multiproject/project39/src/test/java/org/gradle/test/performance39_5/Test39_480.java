package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_480 {
    private final Production39_480 production = new Production39_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}