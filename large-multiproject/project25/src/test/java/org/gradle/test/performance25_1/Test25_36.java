package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_36 {
    private final Production25_36 production = new Production25_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}