package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_291 {
    private final Production39_291 production = new Production39_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}