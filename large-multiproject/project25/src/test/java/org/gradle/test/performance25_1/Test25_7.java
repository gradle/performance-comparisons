package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_7 {
    private final Production25_7 production = new Production25_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}