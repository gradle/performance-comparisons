package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_329 {
    private final Production25_329 production = new Production25_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}