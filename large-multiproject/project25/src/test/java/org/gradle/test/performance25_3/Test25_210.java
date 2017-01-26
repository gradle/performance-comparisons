package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_210 {
    private final Production25_210 production = new Production25_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}