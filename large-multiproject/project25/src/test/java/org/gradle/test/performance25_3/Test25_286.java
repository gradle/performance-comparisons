package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_286 {
    private final Production25_286 production = new Production25_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}