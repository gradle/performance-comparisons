package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_395 {
    private final Production25_395 production = new Production25_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}