package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_485 {
    private final Production39_485 production = new Production39_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}