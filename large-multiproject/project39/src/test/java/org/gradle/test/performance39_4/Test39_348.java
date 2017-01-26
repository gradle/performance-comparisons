package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_348 {
    private final Production39_348 production = new Production39_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}