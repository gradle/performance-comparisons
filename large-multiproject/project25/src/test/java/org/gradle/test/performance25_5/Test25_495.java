package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_495 {
    private final Production25_495 production = new Production25_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}