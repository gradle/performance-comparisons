package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_63 {
    private final Production25_63 production = new Production25_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}