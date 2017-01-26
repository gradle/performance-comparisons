package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_287 {
    private final Production39_287 production = new Production39_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}