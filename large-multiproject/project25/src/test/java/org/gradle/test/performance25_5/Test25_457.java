package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_457 {
    private final Production25_457 production = new Production25_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}