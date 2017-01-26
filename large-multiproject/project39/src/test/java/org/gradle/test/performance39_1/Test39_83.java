package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_83 {
    private final Production39_83 production = new Production39_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}