package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_256 {
    private final Production39_256 production = new Production39_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}