package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_39 {
    private final Production25_39 production = new Production25_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}