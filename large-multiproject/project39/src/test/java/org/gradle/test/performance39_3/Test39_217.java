package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_217 {
    private final Production39_217 production = new Production39_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}