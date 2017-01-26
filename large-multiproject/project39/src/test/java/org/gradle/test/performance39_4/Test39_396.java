package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_396 {
    private final Production39_396 production = new Production39_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}