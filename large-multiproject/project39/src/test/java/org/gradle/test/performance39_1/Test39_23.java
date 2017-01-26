package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_23 {
    private final Production39_23 production = new Production39_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}