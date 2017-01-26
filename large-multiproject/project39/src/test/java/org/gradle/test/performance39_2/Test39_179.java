package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_179 {
    private final Production39_179 production = new Production39_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}