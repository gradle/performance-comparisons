package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_153 {
    private final Production39_153 production = new Production39_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}