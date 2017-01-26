package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_370 {
    private final Production39_370 production = new Production39_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}