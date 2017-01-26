package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_171 {
    private final Production39_171 production = new Production39_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}