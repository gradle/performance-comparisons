package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_198 {
    private final Production39_198 production = new Production39_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}