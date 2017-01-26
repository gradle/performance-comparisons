package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_457 {
    private final Production39_457 production = new Production39_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}