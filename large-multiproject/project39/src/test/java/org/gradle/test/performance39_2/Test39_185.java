package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_185 {
    private final Production39_185 production = new Production39_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}