package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_231 {
    private final Production25_231 production = new Production25_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}