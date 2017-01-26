package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_272 {
    private final Production39_272 production = new Production39_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}