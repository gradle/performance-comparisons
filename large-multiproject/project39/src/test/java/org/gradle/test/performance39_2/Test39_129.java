package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_129 {
    private final Production39_129 production = new Production39_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}