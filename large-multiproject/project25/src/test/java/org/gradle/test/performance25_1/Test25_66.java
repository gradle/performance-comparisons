package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_66 {
    private final Production25_66 production = new Production25_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}