package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_168 {
    private final Production25_168 production = new Production25_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}