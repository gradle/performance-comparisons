package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_391 {
    private final Production39_391 production = new Production39_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}