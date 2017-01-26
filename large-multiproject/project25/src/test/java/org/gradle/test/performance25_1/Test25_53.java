package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_53 {
    private final Production25_53 production = new Production25_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}