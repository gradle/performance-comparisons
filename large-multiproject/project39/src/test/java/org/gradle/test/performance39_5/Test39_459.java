package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_459 {
    private final Production39_459 production = new Production39_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}