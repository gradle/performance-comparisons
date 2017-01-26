package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_246 {
    private final Production25_246 production = new Production25_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}