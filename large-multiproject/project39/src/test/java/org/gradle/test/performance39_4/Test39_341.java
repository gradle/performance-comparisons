package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_341 {
    private final Production39_341 production = new Production39_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}