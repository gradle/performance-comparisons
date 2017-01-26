package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_412 {
    private final Production39_412 production = new Production39_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}