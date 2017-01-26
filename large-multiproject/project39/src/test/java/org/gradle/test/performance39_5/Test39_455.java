package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_455 {
    private final Production39_455 production = new Production39_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}