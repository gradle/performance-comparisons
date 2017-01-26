package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_465 {
    private final Production25_465 production = new Production25_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}