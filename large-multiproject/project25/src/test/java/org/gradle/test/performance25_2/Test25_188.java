package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_188 {
    private final Production25_188 production = new Production25_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}