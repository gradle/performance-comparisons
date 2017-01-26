package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_206 {
    private final Production39_206 production = new Production39_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}