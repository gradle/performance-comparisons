package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_134 {
    private final Production25_134 production = new Production25_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}