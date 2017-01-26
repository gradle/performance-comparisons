package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_154 {
    private final Production25_154 production = new Production25_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}