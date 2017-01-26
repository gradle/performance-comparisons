package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_436 {
    private final Production39_436 production = new Production39_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}