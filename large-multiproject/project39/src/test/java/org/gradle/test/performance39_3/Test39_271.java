package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_271 {
    private final Production39_271 production = new Production39_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}