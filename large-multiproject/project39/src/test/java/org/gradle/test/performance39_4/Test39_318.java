package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_318 {
    private final Production39_318 production = new Production39_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}