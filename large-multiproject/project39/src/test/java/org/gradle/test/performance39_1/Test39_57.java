package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_57 {
    private final Production39_57 production = new Production39_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}