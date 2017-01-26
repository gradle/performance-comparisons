package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_160 {
    private final Production39_160 production = new Production39_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}