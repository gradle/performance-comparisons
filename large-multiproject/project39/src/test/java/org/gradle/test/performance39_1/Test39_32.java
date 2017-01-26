package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_32 {
    private final Production39_32 production = new Production39_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}