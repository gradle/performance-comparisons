package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_171 {
    private final Production25_171 production = new Production25_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}