package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_342 {
    private final Production39_342 production = new Production39_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}