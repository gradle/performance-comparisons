package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_203 {
    private final Production25_203 production = new Production25_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}