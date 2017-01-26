package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_474 {
    private final Production25_474 production = new Production25_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}