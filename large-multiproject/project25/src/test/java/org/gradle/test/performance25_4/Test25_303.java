package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_303 {
    private final Production25_303 production = new Production25_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}