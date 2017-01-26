package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_405 {
    private final Production25_405 production = new Production25_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}