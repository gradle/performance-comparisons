package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_94 {
    private final Production39_94 production = new Production39_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}