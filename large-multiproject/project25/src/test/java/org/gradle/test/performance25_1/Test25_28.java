package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_28 {
    private final Production25_28 production = new Production25_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}