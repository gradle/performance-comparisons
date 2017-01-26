package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_443 {
    private final Production39_443 production = new Production39_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}