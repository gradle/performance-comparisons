package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_42 {
    private final Production25_42 production = new Production25_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}