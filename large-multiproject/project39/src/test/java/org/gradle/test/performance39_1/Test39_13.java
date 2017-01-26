package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_13 {
    private final Production39_13 production = new Production39_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}