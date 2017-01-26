package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_400 {
    private final Production39_400 production = new Production39_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}