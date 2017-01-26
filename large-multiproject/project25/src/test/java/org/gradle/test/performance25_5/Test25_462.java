package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_462 {
    private final Production25_462 production = new Production25_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}