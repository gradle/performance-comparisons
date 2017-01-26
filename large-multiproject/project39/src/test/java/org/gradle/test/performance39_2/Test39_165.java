package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_165 {
    private final Production39_165 production = new Production39_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}