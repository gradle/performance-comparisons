package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_248 {
    private final Production39_248 production = new Production39_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}