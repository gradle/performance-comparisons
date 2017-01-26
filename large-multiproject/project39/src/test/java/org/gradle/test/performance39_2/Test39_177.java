package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_177 {
    private final Production39_177 production = new Production39_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}