package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_169 {
    private final Production39_169 production = new Production39_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}