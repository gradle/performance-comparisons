package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_252 {
    private final Production39_252 production = new Production39_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}