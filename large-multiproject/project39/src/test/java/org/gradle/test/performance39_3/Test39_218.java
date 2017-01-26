package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_218 {
    private final Production39_218 production = new Production39_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}