package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_237 {
    private final Production39_237 production = new Production39_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}