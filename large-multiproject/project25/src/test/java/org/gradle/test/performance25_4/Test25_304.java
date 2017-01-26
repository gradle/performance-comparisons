package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_304 {
    private final Production25_304 production = new Production25_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}