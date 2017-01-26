package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_221 {
    private final Production39_221 production = new Production39_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}