package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_89 {
    private final Production25_89 production = new Production25_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}