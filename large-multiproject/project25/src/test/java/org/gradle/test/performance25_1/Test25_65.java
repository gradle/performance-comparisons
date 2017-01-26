package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_65 {
    private final Production25_65 production = new Production25_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}