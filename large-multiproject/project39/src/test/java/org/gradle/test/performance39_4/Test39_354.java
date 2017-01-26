package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_354 {
    private final Production39_354 production = new Production39_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}