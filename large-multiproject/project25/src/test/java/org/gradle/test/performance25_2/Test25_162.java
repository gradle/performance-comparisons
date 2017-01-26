package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_162 {
    private final Production25_162 production = new Production25_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}