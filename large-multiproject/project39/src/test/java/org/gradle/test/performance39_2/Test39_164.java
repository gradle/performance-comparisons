package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_164 {
    private final Production39_164 production = new Production39_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}