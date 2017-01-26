package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_330 {
    private final Production25_330 production = new Production25_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}