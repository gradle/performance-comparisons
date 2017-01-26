package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_204 {
    private final Production25_204 production = new Production25_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}